package min;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {
    @MyAnnotation(v = 0.1F, author = "Maks")
    private String fistName;
    private String lastName;
    @MyAnnotation(v = 0.2F, author = "Igor")
    private int age;

    public static void main(String[] args) throws IOException {
        File file = new File("Annotation.txt");
        saveFieldsToFile(file, Main.class);
    }
    public static void saveFieldsToFile(File file, Class<?> myClass) throws IOException {
        Field[] fields = myClass.getDeclaredFields();
        Writer w = new FileWriter(file);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< fields.length; i++) {
            Field field = fields[i];
            if (field.getAnnotation(MyAnnotation.class) instanceof Annotation) {
                sb.append(field.getName()+", ");
            }
        }
        w.write(sb.toString());
        w.close();

    }
}
