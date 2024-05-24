### Archetypes

The intent of this repo is to store a bunch of maven's templates or archetypes. I've create and pushed some archtypes which 
in had used in some moment. But you can create your own archetype or just adapt them for your own propouse.

### Use

create the archetype (using the java-angular archetype as example) :

	$ mvn archetype:generate -DgroupId=com.apedrina.archtypes -DartifactId=java-angular -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-archetype

others examples:

	$ mvn archetype:generate -DgroupId=com.apedrina.archtypes -DartifactId=java-base -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-archetype

install

	$ mvn install

create a new project from the archetype:

	$ mvn archetype:generate -DarchetypeGroupId=com.apedrina.archetypes -DarchetypeArtifactId=java-angular  -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=com.apedrina.test -DartifactId=java-angular-test

### Know more

[https://maven.apache.org/archetype/maven-archetype-plugin/plugin-info.html](https://maven.apache.org/archetype/maven-archetype-plugin/plugin-info.html)
