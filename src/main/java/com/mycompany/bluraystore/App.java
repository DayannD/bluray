package com.mycompany.bluraystore;

import com.mycompany.bluraystore.controller.MovieControllerInterface;
import com.mycompany.bluraystore.controller.file.MovieControllerWithText;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {

        //TODO:Pk ajouter le args ?

        ApplicationContext context = SpringApplication.run(App.class,args);

        MovieControllerInterface controller = context.getBean(MovieControllerInterface.class);

        controller.createMovie();


/*      Scanner scanner = new Scanner(System.in);
        String controllerName = null;
        String serviceName = null;
        String repositoryName = null;*/

/*        System.out.println("quelle est le controller que vous voulez");
        String controllerName = scanner.nextLine();

        System.out.println("quelle est le service que vous voulez");
        String serviceName = scanner.nextLine();

        System.out.println("quelle est le repository que vous voulez");
        String repositoryName = scanner.nextLine();*/

        /*System.out.println("quelle est le scéna que vous voulez");
        String scéna = scanner.nextLine();
        switch (scéna){
            case "1":
                controllerName = "com.mycompany.bluraystore.controller.controller.MovieController";
                serviceName = "com.mycompany.bluraystore.service.console.MovieService";
                repositoryName = "com.mycompany.bluraystore.repository.memory.MovieRepository";
                break;
            case "2":
                controllerName = "com.mycompany.bluraystore.controller.file.MovieControllerWithText";
                serviceName = "com.mycompany.bluraystore.service.file.MovieServiceWithText";
                repositoryName = "com.mycompany.bluraystore.repository.file.MovieRepositoryWithText";
                break;
        }

        MovieControllerInterface controller = null;
        MovieServiceInterface service = null;
        MovieRepositoryInterface repository = null;

        //com.mycompany.bluraystore.controller.controller.MovieController ou com.mycompany.bluraystore.controller.file.MovieControllerWithText
        //com.mycompany.bluraystore.service.console.MovieService ou com.mycompany.bluraystore.service.file.MovieServiceWithText
        //com.mycompany.bluraystore.repository.memory.MovieRepository ou com.mycompany.bluraystore.repository.file.MovieRepositoryWithText

        try {
            controller = (MovieControllerInterface) Class.forName(controllerName).getDeclaredConstructor().newInstance();
            service = (MovieServiceInterface) Class.forName(serviceName).getDeclaredConstructor().newInstance();
            repository = (MovieRepositoryInterface) Class.forName(repositoryName).getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        controller.setMovieService(service);
        service.setMovieRepository(repository);

        controller.createMovie();*/
    }
}
