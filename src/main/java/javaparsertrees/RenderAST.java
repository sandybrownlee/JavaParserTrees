package javaparsertrees;

import java.io.File;


import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.printer.DotPrinter;

import guru.nidi.graphviz.attribute.Color;
import guru.nidi.graphviz.attribute.Style;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.parse.Parser;

public class RenderAST {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.err.println("Please specify a Java source file!");
			System.exit(1);
		}
		
		try {
			CompilationUnit cu = StaticJavaParser.parse(new File(args[0]));
					
			String dot = new DotPrinter(true).output(cu);
			//System.out.println(dot);
			
			MutableGraph g = new Parser().read(dot);
		    Graphviz.fromGraph(g).width(2000).render(Format.PNG).toFile(new File(args[0] + ".png"));
			
		} catch (Exception e) {
			System.err.println("Error finding or parsing " + args[0]);
			e.printStackTrace();
			System.exit(1);
		}
	}
}
