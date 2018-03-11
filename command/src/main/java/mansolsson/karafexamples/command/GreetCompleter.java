package mansolsson.karafexamples.command;

import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.apache.karaf.shell.api.console.CommandLine;
import org.apache.karaf.shell.api.console.Completer;
import org.apache.karaf.shell.api.console.Session;
import org.apache.karaf.shell.support.completers.StringsCompleter;

import java.util.List;

@Service
public class GreetCompleter implements Completer {
    @Override
    public int complete(Session session, CommandLine commandLine, List<String> list) {
        StringsCompleter delegate = new StringsCompleter();
        delegate.getStrings().add("Hello");
        delegate.getStrings().add("Hi");
        return delegate.complete(session, commandLine, list);
    }
}
