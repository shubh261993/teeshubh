pipeline {
    agent any
    stages {

        stage('Checkout') {
            steps {
               echo 'Already configured in Jenkin system.'
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
                        testNG(reportFilenamePattern: '**/testng-results.xml')
                    echo 'publish testng report'
                }
                success {
                         mail to: 'shubhammittal440@gmail.com', subject: 'Build Success', body: 'The build was successful!'
                        }
                failure {
                          mail to: 'shubhammittal440@gmail.com', subject: 'Build Failure', body: 'The build failed!'
                        }
            }
        }
    }
}
