pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Build stage sucessful'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn -f C:\Users\Shubham\.jenkins\workspace\Tinder\optum\pom.xml test -Dtest=Annotatio3'
            }
            post {
                always {
                   echo 'Will report it later.....'
                }
            }
        }
        stage('Deliver') { 
            steps {
                echo 'Sucessfullu deployed' 
            }
        }
    }
}
