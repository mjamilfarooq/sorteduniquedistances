FROM frekele/ant
ADD . /workingdir
WORKDIR /workingdir
RUN ant dist
ENTRYPOINT ["java", "-jar", "application.jar", "datafile.txt"]