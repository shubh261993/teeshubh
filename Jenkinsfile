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
                sh 'mvn clean test'
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
