pipeline {
  agent any
  stages {
    stage('Parallel Stages') {
      parallel {
        stage('Maven run') {
          steps {
            bat 'mvn clean test'
          }
        }

        stage('Maven Version') {
          steps {
            bat 'mvn --version'
          }
        }

      }
    }

  }
}