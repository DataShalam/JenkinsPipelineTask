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
            sh 'sh \'mvn clean test\''
          }
        }

        stage('Maven Version') {
          steps {
            sh 'sh \'mvn --version\''
          }
        }

      }
    }

  }
}