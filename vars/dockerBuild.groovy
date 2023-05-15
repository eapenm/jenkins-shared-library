def call(String project,String tag, String hubUser){
    sh """
      docker image build -t ${hubUser}/${project} .
      docker imgae tag ${hubUser}/${project} ${hubUser}/${project}:tag
      docker imgae tag ${hubUser}/${project} ${hubUser}/${project}:latest
    """
}