package mansolsson.karafexamples.command;

import org.apache.karaf.shell.api.action.*;
import org.apache.karaf.shell.api.action.lifecycle.Service;

@Command(scope = "test", name = "hello", description = "Says hello")
@Service
public class HelloCommand implements Action {
    @Argument(required = true, name = "name")
    @Completion(NameCompleter.class)
    private String name = null;

    @Option(name = "-g", aliases = "--greet")
    @Completion(GreetCompleter.class)
    private String greet = "Hello";

    @Override
    public Object execute() throws Exception {
        System.out.println(greet + " " + name);
        return null;
    }
}
