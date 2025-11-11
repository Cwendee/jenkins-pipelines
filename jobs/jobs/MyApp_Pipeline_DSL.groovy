pipelineJob('MyApp_Pipeline_DSL') {
    definition {
        cps {
            script("""
                pipeline {
                    agent any
                    stages {
                        stage('Build') {
                            steps {
                                echo 'Building...'
                            }
                        }
                        stage('Test') {
                            steps {
                                echo 'Testing...'
                            }
                        }
                        stage('Deploy') {
                            steps {
                                echo 'Deploying...'
                            }
                        }
                    }
                }
            """.stripIndent())
            sandbox()
        }
    }
}
