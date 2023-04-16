package pattern.iterator;

public class Client {

    public static void main(String[] args) {
        StudentAggregateImpl aggregate = new StudentAggregateImpl();

        aggregate.addStudent(new Student("张三","1"));
        aggregate.addStudent(new Student("李四","2"));
        aggregate.addStudent(new Student("王五","3"));
        aggregate.addStudent(new Student("赵六","4"));

        StudentIterator iterator = aggregate.getStudentIterator();

        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.toString());
        }
    }
}
