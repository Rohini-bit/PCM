pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/Rohini-bit/PCM.git'

                // Run Maven as a wrapper.
               sudo sh "./mvnw compile"
                
          echo 'Building the project with maven compile'
 
        }

    }


       stage('Test') {
            steps {
              sudo  sh "./mvnw test"
              

    echo 'Testing the project with maven test'

}
}
stage('Package') {
            steps {
                  sudo sh "./mvnw package"
     echo 'Deploying the project with maven package'

}
 }
  }
   }