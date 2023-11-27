pipeline {
  agent any
  stages {
    stage('Parallel Stages') {
      parallel {
        stage('Maven Run') {
          steps {
            bat 'mvn clean install'
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