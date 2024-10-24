from openjdk:22
copy ./target/Pisomka-0.0.1-SNAPSHOT.jar pisomka.jar
entrypoint ["java", "-jar", "pisomka.jar"]