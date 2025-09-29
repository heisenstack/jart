
run: clean
	@javac geometrical_shapes/*.java *.java -d build
	@java -cp build Main

clean:
	@rm -rf build