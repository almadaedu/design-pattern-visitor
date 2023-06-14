class Manager extends Employee {
    private int vacationDays;

    public Manager(String name, double salary, int vacationDays) {
        super(name, salary);
        this.vacationDays = vacationDays;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}