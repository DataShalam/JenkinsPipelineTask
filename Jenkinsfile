pipeline {
  agent any
  stages {
    stage('Check Branch') {
      steps {
        echo 'Checking out'
      }
    }

    stage('Parallel Stages') {
      parallel {
        stage('Maven Run') {
          steps {
            echo 'Run Maven'
          }
        }

        stage('Maven Version') {
          steps {
            echo 'Maven SOme Version'
          }
        }

      }
    }

  }
}