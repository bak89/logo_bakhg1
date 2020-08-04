/* Logo.java */
/* Generated By:JavaCC: Do not edit this line. Logo.java */
import java.lang.*;
import java.io.*;
import java.util.*;

public class Logo implements LogoConstants {

  static private File javaFile, htmlFile;   // output files
  static private PrintWriter pw;            // printwriter used for every output
  static private int numIndent = 0;         // size of indentation
  static private int counter = 0;

  // to pretty-print the translation
  // uses numIndent and pw defined as static variables in LogoParser
  // writes in pw the numIndent times the indent string
  public static void indent() {
    for (int i=0; i<numIndent; i++) { pw.print("   "); }
  }

  // Main method that reads the source file ".logo" and translates it
  // into two files: ".java" ".html"
  public static void main(String args[]) throws ParseException,
                                                TokenMgrError,
                                                IOException
  {
    // reads the source file ".logo" (first argument of command line)
    BufferedReader in = new BufferedReader(new FileReader(args[0]));
    Logo parser = new Logo(in);
    try {
      parser.start();
      System.out.println("DONE");
    }
    catch (ParseException x) { System.out.println("Syntaxtic Error"); throw x; }
    catch (TokenMgrError x)  { System.out.println("Lexical Error"); throw x; }
  }

  static final public void start() throws ParseException, IOException {
    trace_call("start");
    try {Token t;
      jj_consume_token(LOGO);
      t = jj_consume_token(IDENTIFIER);
// Create the HTML file for the applet
     htmlFile = new File(t.image.toLowerCase() + ".html");
     pw = new PrintWriter(new FileOutputStream(htmlFile));
     pw.println("<html>");
     pw.println("  <body>");
     pw.println("  <applet code='" + t.image.toLowerCase() +
                ".class'width=600 height=600></applet>");
     pw.println("  </html>");
     pw.println("</body>");
     pw.close();
     //Create the Java file and the class
     javaFile = new File(t.image.toLowerCase() + ".java");
     pw = new PrintWriter(new FileOutputStream(javaFile));
     pw.println("import java.awt.Graphics;\n");
     //pw.println("import java.util.*;\n");
     pw.println("public class " + t.image.toLowerCase() +
                " extends java.applet.Applet {\n" );
     numIndent++;
     indent();
     pw.println("private LogoPrimitives logo;\n");
     pw.flush();
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case SUBROUTINE:{
          ;
          break;
          }
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        subroutine();
      }
indent(); numIndent++;
     pw.println("public void paint(Graphics g) {");
     indent();
     pw.println("logo = new LogoPrimitives(this);");
     pw.println();
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case CLEARSCREEN:
        case PENDOWN:
        case PENUP:
        case FORWARD:
        case BACKWARD:
        case LEFTTURN:
        case RIGHTTURN:
        case HIDETURTLE:
        case SHOWTURTLE:
        case WAIT:
        case REPEAT:
        case IF:
        case IFELSE:
        case IDENTIFIER:{
          ;
          break;
          }
        default:
          jj_la1[1] = jj_gen;
          break label_2;
        }
        statement();
      }
numIndent--;
     indent();
     pw.println("}");
      jj_consume_token(END);
numIndent--; indent();
     pw.println("}");
     pw.flush(); pw.close();
    } finally {
      trace_return("start");
    }
  }

  static final public void subroutine() throws ParseException {
    trace_call("subroutine");
    try {Token functionName; boolean firstParameter = true;
      jj_consume_token(SUBROUTINE);
      functionName = jj_consume_token(IDENTIFIER);
indent();
        pw.print("private void "+ functionName.image.toLowerCase() + "(");
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PARAMETER:{
          ;
          break;
          }
        default:
          jj_la1[2] = jj_gen;
          break label_3;
        }
pw.print(firstParameter?"double ":", double ");
            firstParameter = false;
        parameter();
      }
pw.print("){\n");
        numIndent++;
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case CLEARSCREEN:
        case PENDOWN:
        case PENUP:
        case FORWARD:
        case BACKWARD:
        case LEFTTURN:
        case RIGHTTURN:
        case HIDETURTLE:
        case SHOWTURTLE:
        case WAIT:
        case REPEAT:
        case IF:
        case IFELSE:
        case IDENTIFIER:{
          ;
          break;
          }
        default:
          jj_la1[3] = jj_gen;
          break label_4;
        }
        statement();
      }
      jj_consume_token(END);
numIndent--;
        indent();
        pw.println("}\n");
    } finally {
      trace_return("subroutine");
    }
  }

  static final public void statement() throws ParseException {
    trace_call("statement");
    try {Token functionName; boolean firstParameter = true;
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CLEARSCREEN:{
        jj_consume_token(CLEARSCREEN);
indent();
    pw.println("logo.cs();");
        break;
        }
      case PENDOWN:{
        jj_consume_token(PENDOWN);
indent();
    pw.println("logo.pd();");
        break;
        }
      case PENUP:{
        jj_consume_token(PENUP);
indent();
    pw.println("logo.pu();");
        break;
        }
      case HIDETURTLE:{
        jj_consume_token(HIDETURTLE);
indent();
    pw.println("logo.ht();");
        break;
        }
      case SHOWTURTLE:{
        jj_consume_token(SHOWTURTLE);
indent();
    pw.println("logo.st();");
        break;
        }
      case FORWARD:{
        jj_consume_token(FORWARD);
indent();
    pw.print("logo.fd(");
        nexpr();
pw.println(");");
        break;
        }
      case BACKWARD:{
        jj_consume_token(BACKWARD);
indent();
    pw.print("logo.bk(");
        nexpr();
pw.println(");");
        break;
        }
      case LEFTTURN:{
        jj_consume_token(LEFTTURN);
indent();
    pw.print("logo.lt(");
        nexpr();
pw.println(");");
        break;
        }
      case RIGHTTURN:{
        jj_consume_token(RIGHTTURN);
indent();
    pw.print("logo.rt(");
        nexpr();
pw.println(");");
        break;
        }
      case WAIT:{
        jj_consume_token(WAIT);
indent();
    pw.print("logo.wait(");
        nexpr();
pw.println(");");
        break;
        }
      case REPEAT:{
        jj_consume_token(REPEAT);
indent();
    counter++;
    pw.print("for(int i"+ counter+" = 0; i"+counter+" < ");
        nexpr();
pw.println("; i"+counter+"++){");
    numIndent++;
        jj_consume_token(LBRA);
        label_5:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case CLEARSCREEN:
          case PENDOWN:
          case PENUP:
          case FORWARD:
          case BACKWARD:
          case LEFTTURN:
          case RIGHTTURN:
          case HIDETURTLE:
          case SHOWTURTLE:
          case WAIT:
          case REPEAT:
          case IF:
          case IFELSE:
          case IDENTIFIER:{
            ;
            break;
            }
          default:
            jj_la1[4] = jj_gen;
            break label_5;
          }
          statement();
        }
        jj_consume_token(RBRA);
numIndent--;
    counter--;
    indent();
    pw.println("}");
        break;
        }
      case IF:{
        jj_consume_token(IF);
indent();
    pw.print("if(");
        bexpr();
pw.print("){");
    numIndent++;
        jj_consume_token(LBRA);
        label_6:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case CLEARSCREEN:
          case PENDOWN:
          case PENUP:
          case FORWARD:
          case BACKWARD:
          case LEFTTURN:
          case RIGHTTURN:
          case HIDETURTLE:
          case SHOWTURTLE:
          case WAIT:
          case REPEAT:
          case IF:
          case IFELSE:
          case IDENTIFIER:{
            ;
            break;
            }
          default:
            jj_la1[5] = jj_gen;
            break label_6;
          }
          statement();
        }
        jj_consume_token(RBRA);
numIndent--;
    indent();
    pw.println("}");
        break;
        }
      case IFELSE:{
        jj_consume_token(IFELSE);
indent();
    pw.print("if(");
        bexpr();
pw.print("){");
    numIndent++;
        jj_consume_token(LBRA);
        label_7:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case CLEARSCREEN:
          case PENDOWN:
          case PENUP:
          case FORWARD:
          case BACKWARD:
          case LEFTTURN:
          case RIGHTTURN:
          case HIDETURTLE:
          case SHOWTURTLE:
          case WAIT:
          case REPEAT:
          case IF:
          case IFELSE:
          case IDENTIFIER:{
            ;
            break;
            }
          default:
            jj_la1[6] = jj_gen;
            break label_7;
          }
          statement();
        }
        jj_consume_token(RBRA);
numIndent--;
    indent();
    pw.println("}");
    indent();
    pw.println("else{");
    numIndent++;
        jj_consume_token(LBRA);
        label_8:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case CLEARSCREEN:
          case PENDOWN:
          case PENUP:
          case FORWARD:
          case BACKWARD:
          case LEFTTURN:
          case RIGHTTURN:
          case HIDETURTLE:
          case SHOWTURTLE:
          case WAIT:
          case REPEAT:
          case IF:
          case IFELSE:
          case IDENTIFIER:{
            ;
            break;
            }
          default:
            jj_la1[7] = jj_gen;
            break label_8;
          }
          statement();
        }
        jj_consume_token(RBRA);
numIndent--;
    indent();
    pw.println("}");
        break;
        }
      case IDENTIFIER:{
        // identifer statement
        functionName = jj_consume_token(IDENTIFIER);
indent();
    pw.print(functionName.image.toLowerCase()+"(");
        label_9:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case SUB:
          case LPAR:
          case REPCOUNT:
          case NUM:
          case PARAMETER:{
            ;
            break;
            }
          default:
            jj_la1[8] = jj_gen;
            break label_9;
          }
pw.print(firstParameter?"":", ");
            firstParameter = false;
          nexpr();
        }
firstParameter = true;
    pw.println(");");
        break;
        }
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("statement");
    }
  }

  static final public void nexpr() throws ParseException {
    trace_call("nexpr");
    try {Token operator;
      nterm();
      label_10:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ADD:
        case SUB:{
          ;
          break;
          }
        default:
          jj_la1[10] = jj_gen;
          break label_10;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ADD:{
          operator = jj_consume_token(ADD);
pw.print(operator.image);
          break;
          }
        case SUB:{
          operator = jj_consume_token(SUB);
pw.print(operator.image);
          break;
          }
        default:
          jj_la1[11] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        nterm();
      }
    } finally {
      trace_return("nexpr");
    }
  }

  static final public void nterm() throws ParseException {
    trace_call("nterm");
    try {Token operator;
      nfactor();
      label_11:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case MUL:
        case DIV:{
          ;
          break;
          }
        default:
          jj_la1[12] = jj_gen;
          break label_11;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case MUL:{
          operator = jj_consume_token(MUL);
pw.print(operator.image);
          break;
          }
        case DIV:{
          operator = jj_consume_token(DIV);
pw.print(operator.image);
          break;
          }
        default:
          jj_la1[13] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        nfactor();
      }
    } finally {
      trace_return("nterm");
    }
  }

  static final public void nfactor() throws ParseException {
    trace_call("nfactor");
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case SUB:{
        jj_consume_token(SUB);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case NUM:{
          number();
          break;
          }
        case REPCOUNT:{
          repcount();
          break;
          }
        case PARAMETER:{
          parameter();
          break;
          }
        case LPAR:{
          jj_consume_token(LPAR);
          nexpr();
          jj_consume_token(RPAR);
          break;
          }
        default:
          jj_la1[14] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case NUM:{
        number();
        break;
        }
      case REPCOUNT:{
        repcount();
        break;
        }
      case PARAMETER:{
        parameter();
        break;
        }
      case LPAR:{
        jj_consume_token(LPAR);
        nexpr();
        jj_consume_token(RPAR);
        break;
        }
      default:
        jj_la1[15] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("nfactor");
    }
  }

  static final public void bexpr() throws ParseException {
    trace_call("bexpr");
    try {
      bterm();
      label_12:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case OR:{
          ;
          break;
          }
        default:
          jj_la1[16] = jj_gen;
          break label_12;
        }
        jj_consume_token(OR);
        bterm();
      }
    } finally {
      trace_return("bexpr");
    }
  }

  static final public void bterm() throws ParseException {
    trace_call("bterm");
    try {
      bfactor();
      label_13:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case AND:{
          ;
          break;
          }
        default:
          jj_la1[17] = jj_gen;
          break label_13;
        }
        jj_consume_token(AND);
        bfactor();
      }
    } finally {
      trace_return("bterm");
    }
  }

  static final public void bfactor() throws ParseException {
    trace_call("bfactor");
    try {Token b;
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TRUE:{
        b = jj_consume_token(TRUE);
pw.print(b.image);
        break;
        }
      case FALSE:{
        b = jj_consume_token(FALSE);
pw.print(b.image);
        break;
        }
      case NOT:{
        b = jj_consume_token(NOT);
pw.print(b.image);
        jj_consume_token(LPAR);
        bexpr();
        jj_consume_token(RPAR);
        break;
        }
      case SUB:
      case LPAR:
      case REPCOUNT:
      case NUM:
      case PARAMETER:{
        nexpr();
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case EQ:{
          b = jj_consume_token(EQ);
pw.print(b.image);
          break;
          }
        case NE:{
          b = jj_consume_token(NE);
pw.print(b.image);
          break;
          }
        case LT:{
          b = jj_consume_token(LT);
pw.print(b.image);
          break;
          }
        case GT:{
          b = jj_consume_token(GT);
pw.print(b.image);
          break;
          }
        case LE:{
          b = jj_consume_token(LE);
pw.print(b.image);
          break;
          }
        case GE:{
          b = jj_consume_token(GE);
pw.print(b.image);
          break;
          }
        default:
          jj_la1[18] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        nexpr();
        break;
        }
      default:
        jj_la1[19] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("bfactor");
    }
  }

  static final public void number() throws ParseException {
    trace_call("number");
    try {Token t;
      t = jj_consume_token(NUM);
pw.print(t.image);
    } finally {
      trace_return("number");
    }
  }

  static final public void parameter() throws ParseException {
    trace_call("parameter");
    try {Token p;
      p = jj_consume_token(PARAMETER);
pw.print(p.image);
    } finally {
      trace_return("parameter");
    }
  }

  static final public void repcount() throws ParseException {
    trace_call("repcount");
    try {Token r;
      jj_consume_token(REPCOUNT);
pw.print("i" + counter + "");
    } finally {
      trace_return("repcount");
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public LogoTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[20];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x0,0xff000000,0x0,0xff000000,0xff000000,0xff000000,0xff000000,0xff000000,0x800090,0xff000000,0x18,0x18,0x60,0x60,0x800080,0x800090,0x80000,0x40000,0x3f000,0xf00090,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x20,0x81f,0x1000,0x81f,0x81f,0x81f,0x81f,0x81f,0x1400,0x81f,0x0,0x0,0x0,0x0,0x1400,0x1400,0x0,0x0,0x0,0x1400,};
   }

  /** Constructor with InputStream. */
  public Logo(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Logo(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new LogoTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Logo(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new LogoTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
      jj_input_stream = new SimpleCharStream(stream, 1, 1);
   } else {
      jj_input_stream.ReInit(stream, 1, 1);
   }
   if (token_source == null) {
      token_source = new LogoTokenManager(jj_input_stream);
   }

    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Logo(LogoTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(LogoTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      trace_token(token, "");
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
      trace_token(token, " (in getNextToken)");
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[45];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 20; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 45; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  static private int trace_indent = 0;
  static private boolean trace_enabled = true;

/** Enable tracing. */
  static final public void enable_tracing() {
    trace_enabled = true;
  }

/** Disable tracing. */
  static final public void disable_tracing() {
    trace_enabled = false;
  }

  static protected void trace_call(String s) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Call:   " + s);
    }
    trace_indent = trace_indent + 2;
  }

  static protected void trace_return(String s) {
    trace_indent = trace_indent - 2;
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Return: " + s);
    }
  }

  static protected void trace_token(Token t, String where) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Consumed token: <" + tokenImage[t.kind]);
      if (t.kind != 0 && !tokenImage[t.kind].equals("\"" + t.image + "\"")) {
        System.out.print(": \"" + TokenMgrError.addEscapes(t.image) + "\"");
      }
      System.out.println(" at line " + t.beginLine + " column " + t.beginColumn + ">" + where);
    }
  }

  static protected void trace_scan(Token t1, int t2) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Visited token: <" + tokenImage[t1.kind]);
      if (t1.kind != 0 && !tokenImage[t1.kind].equals("\"" + t1.image + "\"")) {
        System.out.print(": \"" + TokenMgrError.addEscapes(t1.image) + "\"");
      }
      System.out.println(" at line " + t1.beginLine + " column " + t1.beginColumn + ">; Expected token: <" + tokenImage[t2] + ">");
    }
  }

}
