pipeline {
    agent any
    stages {

        stage('Checkout') {
            steps {
               echo 'Already configured in Jenkin system.'
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
                  //  publishTestNGResults(testNGXMLReportPattern: '**/testng-results.xml')
                      publishTestNGResults(testNGXMLReportPattern: 'C:\\Users\\Shubham\\.jenkins\\workspace\\Cucumber_Pipeline\\optum\\target\\surefire-reports\\testng-results.xml')
                    echo 'publish testng report'
                }
            }
        }
    }
}
