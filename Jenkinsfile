pipeline {
  agent any

  stages {
    stage('Clone Repository') {
      steps {
        // Clone the code from GitHub
        checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: '7ea2d2d3-b0bb-47b5-bffa-063e30ec53a1', url: 'https://github.com/abhilashgadagoju/JenkinesCI.git']])
      }
    }

    stage('Build JAR') {
      steps {
        // Build your JAR file using Maven
        pwd()
        dir('orderservice') {
            // some block
            bat 'mvn clean package'
             dir('target') {
                bat 'move "OrderService-0.0.1-SNAPSHOT.jar" "C:\\Users\\Abhilash\\Desktop\\Jenkins\\pipeline"'
        
             }
        }
        }
    }

    stage('Build Docker Image') {
      steps {
        // Build the Docker image using the Dockerfile
        script {
          dir('C:\\Users\\Abhilash\\Desktop\\Jenkins\\pipeline') {
              bat 'docker build -t orderserviceimg:v0.1.0 .'
            //docker.build('orderserviceimg:v0.1.0', '-f Dockerfile .')
          }
        }
      }
    }

    stage('Run Docker Container') {
      steps {
        // Run the Docker container
        script {
            bat 'docker rm -f container'
            bat 'docker run -d -p8080:8123 --name container orderserviceimg:v0.1.0'
          //docker.image('orderserviceimg:v0.1.0').run('-p 8080:8123 --name orderservicecontainer')
        }
      }
    }
  }
}
