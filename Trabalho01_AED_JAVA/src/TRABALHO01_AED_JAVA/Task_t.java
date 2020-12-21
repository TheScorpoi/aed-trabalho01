package TRABALHO01_AED_JAVA;


public class Task_t {
    
    private int starting_date;
    private int ending_date;
    private int profit;
    private int assigned_to;
    private int best_assigned_to;

    public Task_t(int starting_date, int ending_date, int profit, int assigned_to, int best_assigned_to) {
        this.starting_date = starting_date;
        this.ending_date = ending_date;
        this.profit = profit;
        this.assigned_to = assigned_to;
        this.best_assigned_to = best_assigned_to;
    }

    public int getStarting_date() {
        return starting_date;
    }

    public void setStarting_date(int starting_date) {
        this.starting_date = starting_date;
    }

    public int getEnding_date() {
        return ending_date;
    }

    public void setEnding_date(int ending_date) {
        this.ending_date = ending_date;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(double d) {
        this.profit = (int) d;
    }

    public int getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(int assigned_to) {
        this.assigned_to = assigned_to;
    }

    public int getBest_assigned_to() {
        return best_assigned_to;
    }

    public void setBest_assigned_to(int best_assigned_to) {
        this.best_assigned_to = best_assigned_to;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + assigned_to;
        result = prime * result + best_assigned_to;
        result = prime * result + ending_date;
        result = prime * result + profit;
        result = prime * result + starting_date;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Task_t other = (Task_t) obj;
        if (assigned_to != other.assigned_to)
            return false;
        if (best_assigned_to != other.best_assigned_to)
            return false;
        if (ending_date != other.ending_date)
            return false;
        if (profit != other.profit)
            return false;
        if (starting_date != other.starting_date)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Task_t [assigned_to=" + assigned_to + ", best_assigned_to=" + best_assigned_to + ", ending_date="
                + ending_date + ", profit=" + profit + ", starting_date=" + starting_date + "]";
    }
}
