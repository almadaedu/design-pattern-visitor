class SalaryVisitor implements Visitor {
    private double totalSalary;

    public void visit(Manager manager) {
        totalSalary += manager.getSalary();
    }

    public void visit(Developer developer) {
        totalSalary += developer.getSalary();
    }

    public double getTotalSalary() {
        return totalSalary;
    }
}