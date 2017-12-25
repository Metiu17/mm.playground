FROM java:8 

# Install maven
RUN apt-get update
RUN apt-get install -y maven

WORKDIR /code/trial

# Build package
ADD trial /code/trial
RUN ["mvn", "clean", "install", "-DskipTests"]

EXPOSE 4567
CMD ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java", "-cp", "target/trial-1.0-SNAPSHOT.jar", "mm.playground.trial.Main"]