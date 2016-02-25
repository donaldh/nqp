package org.perl6.nqp.runtime;

public @interface LexicalValue {
	String name();
	String sc();
	int index();
	int flags();
}
