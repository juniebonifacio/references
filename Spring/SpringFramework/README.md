Note: 
This project was created using mvn archetype:generate

and selected archetype 513:
513: remote -> org.apache.maven.archetypes:maven-archetype-quickstart (An archetype which contains a sample Maven project.)

Commands:
mvn archetype:generate
mvn clean eclipse:clean eclipse:eclipse

Description:

Spring Framework includes a number of different modules. Here we are showing spring-context which provides core functionality. Refer to the getting started guides on the right for other options.

Once you've set up your build with the spring-context dependency, you'll be able to do this project.

The example above shows the basic concept of dependency injection, the MessagePrinter is decoupled from the MessageService implementation, with Spring Framework wiring everything together.
