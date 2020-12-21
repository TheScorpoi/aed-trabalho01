package TRABALHO01_AED_JAVA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterInfo;

public class JobSelection {
    public static void main(String[] args) {

        Problem_t problem =  null;
        int NMEC, T, P, I;

        NMEC = Integer.parseInt(args[0]);
        T = Integer.parseInt(args[1]);
        P = Integer.parseInt(args[2]);
        I = Integer.parseInt(args[3]);
        init_problem(NMEC, T, P, I, problem);
        solve(problem);
    }

    public int compare_tasks(Task_t t1, Task_t t2) {
        int d1, d2;

        d1 = t1.getStarting_date();
        d2 = t2.getStarting_date();

        if (d1 != d2) {
            return (d1 < d2) ? -1 : +1;
        }

        d1 = t1.getEnding_date();
        d2 = t2.getEnding_date();
        if (d1 != d2) {
            return (d1 < d2) ? -1 : +1;
        }
        return 0;
    }

    public static void init_problem(int NMec, int T, int P, int ignore_profit, Problem_t problem) {

        int i, r, scale, span, total_span;
        List<Integer> weight = new ArrayList<>();

        // Input validation
        if (NMec < 1 || NMec > 999999) {
            System.out.printf("Bad NMEC (1 <= NMec (%d)) <= 999999", NMec);
            return;
        }
        if (T < 1 || T > 64) {
            System.out.printf("Bad T (1 <= T (%d) <= 64)", T);
            return;
        }
        if (P < 1 || P > 10) {
            System.out.printf("Bad P (1 <= P (%d) <= %d)", P);
            return;
        }

        // the starting and ending dates of each task satisfy 0 <= starting_date <=
        // ending_date <= total_span
        total_span = (10 * T + P - 1) / P;
        if (total_span < 30) {
            total_span = 30;
        }

        // probability of each possible task duration
        // ! Nao sei como se faz para alocar memoria em Java, ou qual a operacao
        // semelhante, ou se nem há
        // weight = (int *)alloca((size_t)(total_span + 1) * sizeof(int)); // allocate
        // memory (freed automatically)
        // if (weight == NULL) {
        // fprintf(stderr, "Strange! Unable to allocate memory\n");
        // exit(1);
        // }

        int tail = 1; // ! NAO SEI O QUE É O TAIL

        scale = (int) Math.ceil(tail * 10.0 * ((double) total_span - 29) / 298.0);
        if (scale < tail) {
            scale = tail;
        }
        // weight[0] = 0;
        // weight[1] = 0;

        for (i = 2; i <= 10; i++) {
            weight.add(i, scale * (2 * i));
        }
        for (i = 11; i <= 29; i++) {
            weight.add(i, scale * (30 - i));
        }
        for (i = 30; i <= total_span; i++) {
            weight.add(i, tail);
        }

        // accumulate the weigths (cummulative distribution)
        int sum = 0;
        for (i = 1; i <= total_span; i++) {
            sum += weight.get(i - 1);
            weight.add(i, sum);
        }

        // ! numero random

        problem.setnMec(NMec);
        problem.setT(T);
        problem.setP(P);
        problem.setnMec((ignore_profit == 0) ? 0 : 1);

        for (i = 0; i < T; i++) {
            // tasks starting and ending dates
            r = 1 + (int) Math.random() % weight.get(total_span);

            for (span = 0; span < total_span; span++) {
                if (r <= weight.get(span)) {
                    break;
                }

                problem.task.get(i).setStarting_date((int) Math.random() % (total_span - span + 1));
                problem.task.get(i).setEnding_date(problem.task.get(i).getStarting_date() + span - 1);

            }

            scale = (int) Math.random() % 12501;
            if (scale <= 2500) {
                problem.task.get(i).setProfit(1 + Math.round((double) span) * (50.0 + Math.sqrt((double) scale)));
            } else {
                problem.task.get(i).setProfit(1 + Math.round((double) span) * (300.0 - 2.0 * Math.sqrt((double) (12500 - scale))));
            }

            // sort the tasks by the starting date
        }
        // finish

        if (problem.getI() != 0) {
            for (i = 0; i < problem.getT(); i++) {
                problem.task.get(i).getProfit() = 1;
            }
        }
    }

    public void recursive_function(Problem_t problem, int i) {

        if (i == 0) {
            problem.setTotal_profit(0);
            problem.setBest_total_profit(0);
            for (int k = 0; k < problem.getP(); k++) {
                problem.busy.get(k).add(-1);
            }
        }

        if (i == problem.getT()) {
            if (problem.getTotal_profit() > problem.getBest_total_profit()) {
                problem.setBest_total_profit(problem.getTotal_profit());
            }
            return;
        }

        problem.task.get(i).setAssigned_to(-1);

        recursive_function(problem, i + 1);

        for (int j = 0; j < problem.getP(); j++) {
            if (problem.busy.get(j) < problem.task.get(i).getStarting_date()) {
                int profit_tmp = problem.getTotal_profit();
                int busy_tmp = problem.busy.get(j);

                problem.busy.get(j).setBusy(problem.task.get(i).getEnding_date());
                problem.setTotal_profit((problem.getTotal_profit() + problem.task.get(i).getProfit()));
                problem.task.get(i).setAssigned_to(-1);

                recursive_function(problem, i + 1);

                problem.task.get(i).setAssigned_to(-1);
                problem.setTotal_profit(profit_tmp);
                problem.busy.get(j) = busy_tmp;

                return;
            }
        }
    }

    public static void solve(Problem_t problem) {

        StringBuilder nameFile = new StringBuilder();
        nameFile.append(problem.getT() + "_" + problem.getP() + "_" + problem.getI() + ".txt");

        try (PrintWriter out = new PrintWriter(new File( nameFile ))) {
            out.printf("NMec = %d\n", problem.getnMec());
            out.printf("T = %d\n", problem.getT());
            out.printf("P = %d\n", problem.getP());
            out.printf("Profits%s  = %d\n", (problem.getI() == 0) ? " not" : "");
            out.printf("Best Profit = %d\n", problem.getBest_total_profit());
            out.printf("Best Assigned = %d\n", problem.getBest_assigned_to());
            out.printf("Solution time = %.3e\n", problem.getCpu_time());
            out.printf("Task date  Profit    P\n");

            for (int i = 0; i < problem.getT(); i++) {
                out.printf("%-3d %-3d   %-8d %-4d\n", problem.task.get(i).getStarting_date(),
                        problem.task.get(i).getEnding_date(), problem.task.get(i).getProfit(),
                        problem.task.get(i).getAssigned_to());
            }
            out.printf("End\n");

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
