 stages {
        stage('Build') {
            steps {
                echo 'Build app'
            }
        }
   stage('Test') {
            steps {
                echo 'App tested'
            }
        }
   stage('Deploy') {
            steps {
                echo 'Deploye'
            }
        }
  post
  {
   always
   {
    emailtext body: 'Summary', subject: 'Pipeline Status', to: 'yesrk786@gmail.com'
   }
  }
    }
