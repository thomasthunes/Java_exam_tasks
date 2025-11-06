package PathStuff;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyingTest {

    public static void main(String[] args) throws IOException {
        File rabbit = new File("./Animals/rabbit.txt");
        File fox = new File("./Animals/fox.txt");

        File mountain = new File("./mountain");
        File forrest = new File("./forrest");

        Files.copy(
                rabbit.toPath(),
                mountain.toPath().resolve(rabbit.getName()),
                StandardCopyOption.REPLACE_EXISTING
        );

        Files.move(
                rabbit.toPath(),
                mountain.toPath().resolve("new_" + rabbit.getName()),
                StandardCopyOption.REPLACE_EXISTING
        );

        System.out.println(fox.isFile());
        //System.out.println(rabbit.createNewFile());


    }
}
