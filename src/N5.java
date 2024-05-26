
public class N5 {
    public static void main(String[] args) {
        // Создаем массив объектов Worker размером 7
        Worker[] worker = new Worker[7];
        // Инициализируем каждый элемент массива Worker с данными о работниках
        worker[0] = new Worker("Лара", "Петрович", "Пупкин", 77, 15000);
        worker[1] = new Worker("Митяй", "Сидорович", "Иванов", 14, 30001);
        worker[2] = new Worker("Ваня", "Станиславович", "Миронов", 26, 19000);
        worker[3] = new Worker("Паучиха", "Ивановна", "Кузнецова", 48, 35000);
        worker[4] = new Worker("Маруся", "Ильинична", "Шайхутдинова", 12, 18000);
        worker[5] = new Worker("Петя", "Николаевич", "Артуров", 33, 45000);
        worker[6] = new Worker("Нико", "Полиграфович", "Польнореффов", 45, 70000);

        // Перебираем все элементы массива Worker
        for (int i = 0; i < worker.length; i++) {
            // Проверяем, если зарплата работника больше 30000
            if (worker[i].getSalary() > 30000) {
                // Выводим информацию о работнике, если его зарплата больше 30000
                System.out.println("ФИО: " + worker[i].getName() +
                        " " + worker[i].getSurname() +
                        " " + worker[i].getFamily() +
                        ", возраст: " + worker[i].getAge() +
                        ", зряплата: " + worker[i].getSalary());
            }
        }
    }
}

class Worker {
    private String name, surname, family;
    private int age, salary;

    // Конструктор класса Worker для инициализации полей name, surname, family, age,
    // salary
    public Worker(String name, String surname, String family, int age, int salary) {
        this.name = name;
        this.surname = surname;
        this.family = family;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        String name = this.name;
        return name;
    }

    public String getSurname() {
        String surname = this.surname;
        return surname;
    }

    public String getFamily() {
        String family = this.family;
        return family;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
}
