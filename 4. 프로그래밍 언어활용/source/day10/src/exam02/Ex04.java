package exam02;

@Todo("todo1")
@Todo("todo2")
@Todo("todo3")
public class Ex04 {
    public static void main(String[] args) {
        Class cls = Ex04.class;
        Todos todos = (Todos)cls.getAnnotation(Todos.class);
        Todo[] todo = todos.value();

        for (Todo t : todo) {
            System.out.println(t.value());
        }
    }
}
