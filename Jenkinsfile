pipeline {
    agent any
    stages {

        stage('Checkout') {
            steps {
               git 'https://github.com/shubh261993/teeshubh.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn -f C:\\Users\\Shubham\\.jenkins\\workspace\\Cucumber_Pipeline\\optum\\pom.xml validate'
                bat 'mvn -f C:\\Users\\Shubham\\.jenkins\\workspace\\Cucumber_Pipeline\\optum\\pom.xml clean'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn -f C:\\Users\\Shubham\\.jenkins\\workspace\\Cucumber_Pipeline\\optum\\pom.xml test -Dtest=Annotatio3'
            }
            post {
                always {
                    // Publish TestNG results
                    publishTestNGResults(testNGXMLReportPattern: '**/testng-results.xml')
                }
            }
        }
    }
}
