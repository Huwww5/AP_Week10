package git;
@FunctionalInterface
public interface Check {
	
	// by default method in an interface is public and abstract
	int compare(Company s1, Company s2);
	
}
