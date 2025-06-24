pipeline {
    agent any
    parameters{
        choice(name:'suite',choices:['smoke','regression'],description:'choose suite to run')
    }
    stages {

        stage('Checkout') {
            steps {
               echo 'Already configured in Jenkin system.'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn -f C:\\Users\\Shubham\\.jenkins\\workspace\\Papua\\optum\\pom.xml validate'
                bat 'mvn -f C:\\Users\\Shubham\\.jenkins\\workspace\\Papua\\optum\\pom.xml clean'
                bat 'mvn -f C:\\Users\\Shubham\\.jenkins\\workspace\\Papua\\optum\\pom.xml compile'
            }
        }
        stage('Test') {
            steps {
                script {
                    def command = ''
                    if(params.SUITE == 'smoke'){
                        command = bat 'mvn -f C:\\Users\\Shubham\\.jenkins\\workspace\\Papua\\optum\\pom.xml test -Dtest=Annotatio3'
                    } else if (params.SUITE == 'regression')
                    {
                        command = bat 'mvn -f C:\\Users\\Shubham\\.jenkins\\workspace\\Papua\\optum\\pom.xml test -Dtest=TestNGAnnotation'
                    } else {
                        error("Unknown test suites: ${params.SUITE}")
                    }
                }
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
