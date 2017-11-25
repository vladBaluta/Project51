package boundary;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("api")
public class HelloWorldApplication extends Application{
	 @Override
	    public Set<Class<?>> getClasses() {
	        Set<Class<?>> classes = new HashSet<Class<?>>();
	        classes.add(BoundaryApiImpl.class);
	        return classes;
	    }
}
