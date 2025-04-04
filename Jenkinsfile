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
                    junit 'target/surefire-reports/*.xml'
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
