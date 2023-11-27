pipeline {
  agent any
  stages {
    stage('Parallel Stages') {
      parallel {
        stage('Maven Run') {
          steps {
            sh 'mvn clean test'
          }
        }

        stage('Maven Version') {
          steps {
            sh 'mvn --version'
          }
        }

      }
    }

  }
}