create

mvn archetype:generate -DgroupId=io.github.apedrina.test -DartifactId=springboot-jwt-test -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-archetype

mvn archetype:generate                                  \
-DarchetypeGroupId=io.github.apedrina.archetypes                \
-DarchetypeArtifactId=springboot-jwt-archetype          \
-DarchetypeVersion=1.0-SNAPSHOT                \
-DgroupId=io.github.apedrina                                \
-DartifactId=springboot-jwt-test

mvn archetype:generate -DarchetypeGroupId=io.github.apedrina.archetypes -DarchetypeArtifactId=springboot-jwt  -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=io.github.apedrina -DartifactId=springboot-jwt-test