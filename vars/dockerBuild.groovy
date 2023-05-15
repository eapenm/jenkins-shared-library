def call(String project,String tag, String hubUser){
    sh """
      docker image build -t ${hubuser}/${project} .
      docker imgae tag ${hubuser}/${project} ${hubuser}/${project}:tag
      docker imgae tag ${hubuser}/${project} ${hubuser}/${project}:latest
    """
}