pipeline {
  agent any
  stages {
    stage('Two Parallel Stages') {
      parallel {
        stage('Run Maven Project') {
          steps {
            sh 'sh \'mvn clean test\''
          }
        }

        stage('Get Maven Version ') {
          steps {
            sh 'sh \'mvn --version\''
          }
        }

      }
    }

  }
}