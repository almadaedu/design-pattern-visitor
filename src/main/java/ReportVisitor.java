class ReportVisitor implements Visitor {
    private int totalVacationDays;

    public void visit(Manager manager) {
        totalVacationDays += manager.getVacationDays();
    }

    public void visit(Developer developer) {
        // Não faz nada com os desenvolvedores neste exemplo
    }

    public int getTotalVacationDays() {
        return totalVacationDays;
    }
}