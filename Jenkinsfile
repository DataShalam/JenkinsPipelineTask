pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean install -Dlicense.skip=true'
      }
    }

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