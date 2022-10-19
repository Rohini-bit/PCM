pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/Rohini-bit/PCM.git'

                // Run Maven Wrapper Commands
               
                sh "mvnw compile"

                echo 'Building the Project with maven compile'
            }
        }

        stage('Test') {
            steps {

                // Run Maven Wrapper Commands
                sh "./mvnw test"

                echo 'Testing the Project with maven test'
            }
        }

        stage('Package') {
            steps {

                // Run Maven Wrapper Commands
                sh "./mvnw package"
                //sh "./mvnw package -Dmaven.test.skip=true"

                echo 'Packaging the Project with maven package'
            }
        }
   
        
  
    }
}