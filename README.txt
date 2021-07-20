### Archtypes

The intent of this repo is to store a bunch of maven's templates or archtypes. I've create and pushed some archtypes which 
in had used in some moment. But you can create your own archtype or just adapt them for your own propouse.

### Use

create the archtype (using the java-angular archtype as example) :

	$ mvn archetype:generate -DgroupId=com.apedrina.archtypes -DartifactId=java-angular -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-archetype

install

	$ mvn install

create a new project from the archtype:

	$ mvn archetype:generate -DarchetypeGroupId=com.apedrina.archtypes -DarchetypeArtifactId=java-angular  -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=com.apedrina.test -DartifactId=java-angular-test

### Know more

[https://maven.apache.org/archetype/maven-archetype-plugin/plugin-info.html](https://maven.apache.org/archetype/maven-archetype-plugin/plugin-info.html)