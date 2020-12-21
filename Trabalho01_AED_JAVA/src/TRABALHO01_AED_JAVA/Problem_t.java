package TRABALHO01_AED_JAVA;

import java.util.ArrayList;
import java.util.List;

public class Problem_t extends Task_t {

    private int nMec;
    private int T;
    private int P;
    private int I;
    private int total_profit;
    private int best_total_profit;
    private double cpu_time;
    List<Task_t> task = new ArrayList<Task_t>();
    List<Integer> busy = new ArrayList<>();
    List<String> dir_name = new ArrayList<>();
    List<String> file_name = new ArrayList<>();

    public Problem_t(int starting_date, int ending_date, int profit, int assigned_to, int best_assigned_to, int nMec,
            int t, int p, int i, int total_profit, int best_total_profit, double cpu_time, List<Task_t> task,
            List<Integer> busy, List<String> dir_name, List<String> file_name) {
        super(starting_date, ending_date, profit, assigned_to, best_assigned_to);
        this.nMec = nMec;
        T = t;
        P = p;
        I = i;
        this.total_profit = total_profit;
        this.best_total_profit = best_total_profit;
        this.cpu_time = cpu_time;
        this.task = task;
        this.busy = busy;
        this.dir_name = dir_name;
        this.file_name = file_name;
    }

   

    public void add(int a){
        busy.add(a);
    }

	public int getnMec() {
        return nMec;
    }

    public void setnMec(int nMec) {
        this.nMec = nMec;
    }

    public int getT() {
        return T;
    }

    public void setT(int t) {
        T = t;
    }

    public int getP() {
        return P;
    }

    public void setP(int p) {
        P = p;
    }

    public int getI() {
        return I;
    }

    public void setI(int i) {
        I = i;
    }

    public int getTotal_profit() {
        return total_profit;
    }

    public void setTotal_profit(int total_profit) {
        this.total_profit = total_profit;
    }

    public int getBest_total_profit() {
        return best_total_profit;
    }

    public void setBest_total_profit(int best_total_profit) {
        this.best_total_profit = best_total_profit;
    }

    public double getCpu_time() {
        return cpu_time;
    }

    public void setCpu_time(double cpu_time) {
        this.cpu_time = cpu_time;
    }

    public List<Task_t> getTask() {
        return task;
    }

    public void setTask(List<Task_t> task) {
        this.task = task;
    }

    public List<Integer> getBusy() {
        return busy;
    }

    public void setBusy(List<Integer> busy) {
        this.busy = busy;
    }

    public List<String> getDir_name() {
        return dir_name;
    }

    public void setDir_name(List<String> dir_name) {
        this.dir_name = dir_name;
    }

    public List<String> getFile_name() {
        return file_name;
    }

    public void setFile_name(List<String> file_name) {
        this.file_name = file_name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + I;
        result = prime * result + P;
        result = prime * result + T;
        result = prime * result + best_total_profit;
        result = prime * result + ((busy == null) ? 0 : busy.hashCode());
        long temp;
        temp = Double.doubleToLongBits(cpu_time);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((dir_name == null) ? 0 : dir_name.hashCode());
        result = prime * result + ((file_name == null) ? 0 : file_name.hashCode());
        result = prime * result + nMec;
        result = prime * result + ((task == null) ? 0 : task.hashCode());
        result = prime * result + total_profit;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Problem_t other = (Problem_t) obj;
        if (I != other.I)
            return false;
        if (P != other.P)
            return false;
        if (T != other.T)
            return false;
        if (best_total_profit != other.best_total_profit)
            return false;
        if (busy == null) {
            if (other.busy != null)
                return false;
        } else if (!busy.equals(other.busy))
            return false;
        if (Double.doubleToLongBits(cpu_time) != Double.doubleToLongBits(other.cpu_time))
            return false;
        if (dir_name == null) {
            if (other.dir_name != null)
                return false;
        } else if (!dir_name.equals(other.dir_name))
            return false;
        if (file_name == null) {
            if (other.file_name != null)
                return false;
        } else if (!file_name.equals(other.file_name))
            return false;
        if (nMec != other.nMec)
            return false;
        if (task == null) {
            if (other.task != null)
                return false;
        } else if (!task.equals(other.task))
            return false;
        if (total_profit != other.total_profit)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Problem_t [I=" + I + ", P=" + P + ", T=" + T + ", best_total_profit=" + best_total_profit + ", busy="
                + busy + ", cpu_time=" + cpu_time + ", dir_name=" + dir_name + ", file_name=" + file_name + ", nMec="
                + nMec + ", task=" + task + ", total_profit=" + total_profit + "]";
    }

}
