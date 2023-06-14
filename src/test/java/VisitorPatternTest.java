import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class VisitorPatternTest {
    @Test
    void testVisitorPattern() {
        // Criação dos elementos
        Manager manager1 = new Manager("John Doe", 5000.0, 20);
        Manager manager2 = new Manager("Jane Smith", 6000.0, 25);
        Developer developer1 = new Developer("Mark Johnson", 4000.0, "Java");
        Developer developer2 = new Developer("Emily Brown", 4500.0, "Python");

        // Criação dos visitors
        ReportVisitor reportVisitor = new ReportVisitor();
        SalaryVisitor salaryVisitor = new SalaryVisitor();

        // Chamada dos métodos accept para visitar os elementos
        manager1.accept(reportVisitor);
        manager2.accept(reportVisitor);
        developer1.accept(reportVisitor);
        developer2.accept(reportVisitor);

        manager1.accept(salaryVisitor);
        manager2.accept(salaryVisitor);
        developer1.accept(salaryVisitor);
        developer2.accept(salaryVisitor);

        // Testes usando assert equals
        assertEquals(45, reportVisitor.getTotalVacationDays());
        assertEquals(19500.0, salaryVisitor.getTotalSalary());
    }
}