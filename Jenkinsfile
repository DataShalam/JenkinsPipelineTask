pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Starting Build'
        sh 'checkout scm'
        echo 'Build Completed'
      }
    }

    stage('Parallel Stages') {
      parallel {
        stage('Run Maven') {
          steps {
            sh 'mvn test'
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