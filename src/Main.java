public class Main {
    public static void main(String[] args) {
        Employee davis = new Employee("Davis", "11/11/1985",  "01/01/2020");
        System.out.println(davis);
        System.out.println("Age = " + davis.getAge());
        System.out.println("Pay = " + davis.collectPay());

        SalariedEmployee albert = new SalariedEmployee("albert", "11/11/1990",  "03/03/2020",35000);
        System.out.println(albert);
        System.out.println("Albert's pay check = $" + albert.collectPay());

        albert.retire();
        System.out.println("Albert's pension check = $ " + albert.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's pay check = $" + mary.collectPay());
        System.out.println("Mary's holiday pay = $" + mary.getDoublePay());

    }
}