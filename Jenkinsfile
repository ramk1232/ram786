pipeline {
    agent any

    stages {
        stage('Build') 
		{
            steps {
                echo 'Build App'
            }
        }
		
		stage('Test') 
		{
            steps {
                echo 'Test App'
            }
        }
		
		stage('Deploy') 
		{
            steps {
                echo 'Deployed  World'
            }
        }
    }
	post
	{
		always 
		{
			emailext body: '', subject: 'Pipeline Status', to: 'yesrk786@gmail.com'
		}
	}
}

