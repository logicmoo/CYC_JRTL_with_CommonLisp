package org.opencyc.chat;

import java.lang.*;
import java.lang.reflect.*;
import java.io.*;
import java.util.*;
import java.net.*;
import org.opencyc.api.*;
import org.opencyc.chat.*;
import org.opencyc.cycobject.*;
import org.opencyc.inference.params.DefaultInferenceParameters;
import org.opencyc.inference.params.InferenceParameters;
import org.opencyc.kif.*;
import org.opencyc.util.*;
import ViolinStrings.*;
import static org.opencyc.api.CycAccess.*;

public class ScriptChat extends IrcChat implements ChatSender
{

	/**
	 * IRC Bot details
	 */
	// Name Bot goes by on IRC
	{
		ircNick = "CycLScriptBot";
	}

	// WHOIS Information
	{
		ircComment = "http://wwwhome.portavita.nl/~yeb/XP/";
	}

	// IRC Auto-join
	{
		ircChannel = "#logicmoo";
	}

	/**
	 * IRC Sever details
	 */
	{
		ircServer = "irc.freenode.net";
	}
	//    public String ircServer = "192.168.229.187";
	//    public String ircServer = "irc.student.utwente.nl";

	//  public int ircPort = 6667;

	// IRC Unkown message replies sentence to
	//    public String ircDestination = "#opencycchat";
	//  public String ircDestination = "#scriptbot";

	// ArrayList of paraphrased writable locations
	//public ArrayList paraphrased = new ArrayList();

	// IRC Debug messages sentence to ( may send to an IRC username instead of channel )
	// public String ircDebug = "yepster";

	/**
	 * IRC Server comunication
	 */
	private Socket ircServerSocket = null;
	private InputStream ircInputStream = null;
	private OutputStream ircOutputStream = null;
	private BufferedReader ircInputReader = null;
	private BufferedWriter ircOutputWriter = null;

	/* verbose? */
	private int verbosity = 5;

	/**
	 * Telent DCC Chat Server
	 */
	//public DccServerThread dccServer = null;

	/**
	 * reference to CycAccess (OpenCyc server)
	 */
	//public CycAccess cyc = null;

	/**
	 * reference to ChatterBot
	 */
	//public ChatterBot chatterBot = null;

	// public boolean running = false;

	/**
	 * Creates a basic unstarted IRC Bot
	 */
	public ScriptChat()
	{
	}

	/**
	 * Creates a full running IRC Bot
	 */
	public ScriptChat(CycAccess access, String nick, String comment, String server, int port, String channel)
	{
		// set the bot's nickname and description
		ircNick = nick;
		ircComment = comment;
		ircServer = server;
		ircPort = port;
		ircChannel = channel;
		cyc = access;
	}

	/**
	 * Provide a command line function to launch the ScriptChat application.
	 */
	public static void main(String[] args)
	{
		try
		{
			ScriptChat ircBot = new ScriptChat();
			ircBot.cyc = new CycAccess();
			ircBot.cyc.traceOn();
			//            ircBot.cyc.setCyclist( "CycAdministrator" );

			if (args.length > 0) ircBot.ircNick = args[0];
			if (args.length > 1) ircBot.ircChannel = args[1];
			if (args.length > 2) ircBot.ircServer = args[2];
			if (args.length > 3) ircBot.ircPort = Integer.parseInt((args[3]));
			System.out.println("Lauching ScriptChat: n\nick='" + ircBot.ircNick + "' \nchannel='" + ircBot.ircChannel + "' \nserver='" + ircBot.ircServer + ":'" + ircBot.ircPort + "");
			ircBot.run();
			System.exit(0);
		} catch (Exception e)
		{
			e.printStackTrace(System.err);
			System.exit(1);
		}
	}

	/**
	 * Connects Bot to an IRC server
	 */
	@Override
	public void ircConnect()
	{
		Log.makeLog();
		try
		{
			ircServerSocket = new Socket(ircServer, ircPort);
		} catch (Exception e)
		{
			System.err.println("error Connecting to IRC server");
			e.printStackTrace();
		}
		try
		{
			ircInputStream = ircServerSocket.getInputStream();
			ircOutputStream = ircServerSocket.getOutputStream();
		} catch (Exception e)
		{
			System.err.println("error opening streams to IRC server");
			e.printStackTrace();
		}
		ircInputReader = new BufferedReader(new InputStreamReader(ircInputStream));
		ircOutputWriter = new BufferedWriter(new OutputStreamWriter(ircOutputStream));
		try
		{
			// send user info
			ircOutputWriter.write("user " + ircNick + " opencyc irc :" + ircComment);
			ircOutputWriter.newLine();
			ircOutputWriter.write("nick " + ircNick);
			ircOutputWriter.newLine();
			ircOutputWriter.flush();
		} catch (Exception e)
		{
			System.out.println("ircLogOn error: " + e);
		}
		ircJoin(ircChannel);
		//paraphrased.add(ircChannel);
		ircJoin(ircDebug);
		this.running = true;
		startChatterBot();
		//        startPlugins();
		return;
	}

	/**
	 * Disconnct Bot from an IRC server
	 */
	@Override
	public void ircDisconnect()
	{
		try
		{
			chatterBot.finalize();
			chatterBot = null;
			ircOutputWriter.write("QUIT this.ircDisconnect();");
			ircOutputWriter.newLine();
			ircOutputWriter.flush();
		} catch (Exception e)
		{
			System.out.println("ircLogOff error: " + e);
			e.printStackTrace();
		}
		// close the IO streams to the IRC server
		try
		{
			ircInputReader.close();
			ircOutputWriter.close();
			ircInputReader = null;
			ircOutputWriter = null;
			ircServerSocket.close();
			ircServerSocket = null;
		} catch (IOException e)
		{
			System.err.println("Error ircDisconnecting from IRC server");
			e.printStackTrace();
		}
	}

	@Override
	public void run()
	{
		ircConnect();
		if (ircChannel != null) ircJoin(ircChannel);
		while (!interrupted() && running)
			try
			{
				this.serviceLoop();
			} catch (Exception e)
			{
				System.out.println("" + e);
			}
	}

	@Override
	public void restartChatterBot()
	{
		terminateChatterBot();
		startChatterBot();
	}

	@Override
	public void terminateChatterBot()
	{
		if (chatterBot != null)
		{
			try
			{
				chatterBot.finalize();
			} catch (Exception e)
			{
				e.printStackTrace(System.err);
			}
			chatterBot = null;
		}
	}

	@Override
	public void startChatterBot()
	{
		if (chatterBot == null)
		{
			try
			{
				chatterBot = new ChatterBot(this);
				chatterBot.initialize();
			} catch (Exception e)
			{
				e.printStackTrace(System.err);
			}
		}
	}

	@Override
	public void serviceLoop() throws Exception
	{
		serviceIRCServer();
	}

	/**
	 * Sends a raw string to the IRC server
	 */
	@Override
	public boolean ircSend(String message)
	{
		System.out.println("irc: '" + message + "'");
		try
		{
			ircOutputWriter.write(message);
			ircOutputWriter.newLine();
			ircOutputWriter.flush();
		} catch (IOException e)
		{
			return false;
		}
		return true;
	}

	@Override
	public void ircJoin(String channel)
	{
		ircSend("JOIN " + channel);
	}

	@Override
	public void ircPart(String channel)
	{
		ircSend("PART " + channel);
	}

	/**
	 * Send a notice to an IRC user
	 * @param destination String
	 * @param message String
	 */
	@Override
	public void sendNotice(String destination, String message)
	{
		ircSend("notice " + destination + " :" + message);
	}

	/**
	 * Send a public message to an IRC user
	 * @param destination String
	 * @param message String
	 */
	@Override
	public boolean sendMessage(String destination, Object post)
	{
		if (post == null || destination == null) return false;
		// Wait a 1/2 sec (Keeps from flooding off server)
		try
		{
			Thread.sleep(500);
		} catch (InterruptedException e)
		{
		}
		if (post instanceof Iterator)
		{
			while (((Iterator) post).hasNext())
			{
				try
				{
					if (ircInputReader.ready()) if (ircInputReader.readLine().trim().endsWith(".")) return true;
				} catch (Exception e)
				{
				}
				sendMessage(destination, ((Iterator) post).next());
			}
			return true;
		}
		if (post instanceof BufferedReader)
		{
			String line = null;
			try
			{
				while ((line = ((BufferedReader) post).readLine()) != null)
					sendMessage(destination, line);
			} catch (Exception e)
			{
				System.out.println("" + e);
				return false;
			}
			return true;
		}
		if (post instanceof CycList && isParaphrased(destination)) return sendMessage(destination, attemptParaphrase((CycList) post) + " (" + ((CycList) post).toString() + ")");
		String message = post.toString().trim();
		if (ViolinStrings.Strings.contains(message, "\n") || ViolinStrings.Strings.contains(message, "\r")) return sendMessage(destination, new BufferedReader(new StringReader(message)));
		if (message.length() > 200)
		{
			int justify = message.substring(190).indexOf(' ') + 190;
			ircSend("privmsg " + destination + " :" + message.substring(0, justify - 1));
			return sendMessage(destination, message.substring(justify));
		}
		return ircSend("privmsg " + destination + " :" + message);
	}

	@Override
	public String attemptParaphrase(Object post)
	{
		//Log.current.println("attemptParaphrase=" + post);
		if (post == null) return null;
		try
		{
			if (post instanceof Iterator)
			{
				if (!(((Iterator) post).hasNext())) return "none.";
				StringBuffer sb = new StringBuffer(attemptParaphrase(((Iterator) post).next()));
				while (((Iterator) post).hasNext())
					sb.append(", ").append(attemptParaphrase(((Iterator) post).next()));
				return sb.toString();
			}
			if (post instanceof CycConstant) return cyc.converseString("(generate-phrase " + ((CycConstant) post).stringApiValue() + ")");
			if (post instanceof CycNart) return cyc.converseString("(generate-phrase '" + ((CycNart) post).cyclify() + ")");
			if (post instanceof CycVariable) return (((CycVariable) post).stringApiValue());
			if (post instanceof CycList)
			{
				if (((CycList) post).isEmpty()) return "an empty list ";
				if (!((CycList) post).isProperList())
					// return attemptParaphrase(((CycList)post).first()) + " = " + (((CycList)post).rest());
					return attemptParaphrase(((CycList) post).first()) + " = " + attemptParaphrase(((CycList) post).rest());
				if (((CycList) post).first() instanceof CycList) return attemptParaphrase(((CycList) post).iterator());
				return cyc.converseString("(generate-phrase '" + ((CycList) post).cyclify() + ")");
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return post.toString();
	}

	/**
	 * Receives and parses IRC Server messages
	 */
	@Override
	public void serviceIRCServer() throws Exception
	{
		// Wait a 1/10th sec
		try
		{
			Thread.sleep(100);
		} catch (InterruptedException e)
		{
		}
		// Data ?
		if (!ircInputReader.ready()) return;
		String message = ircInputReader.readLine();
		//System.out.println(message);
		// send a pong back
		if (message.substring(0, 4).equalsIgnoreCase("ping"))
		{
			ircSend("pong " + message.substring(5));
			return;
		}
		serviceIRCSession(message);
	}

	/**
	 * Receives and parses IRC Session messages
	 */
	@Override
	public void serviceIRCSession(String message)
	{
		String prefix = null;
		String command = null;
		String params = null;
		String user = null;
		// check for the prefix
		if (message.substring(0, 1).equals(":"))
		{
			prefix = message.substring(1, message.indexOf(' '));
			message = message.substring(message.indexOf(' ') + 1);
		}
		// extract the command
		command = message.substring(0, message.indexOf(' '));
		// get the parameters (the rest of the message)
		params = message.substring(message.indexOf(' ') + 1);
		if (params.toLowerCase().startsWith(":closing"))
		{
			ircConnect();
			return;
		}
		try
		{
			int col = params.indexOf(':');
			String destination = params.substring(0, col - 1).trim();
			ircDestination = destination;
			params = params.substring(col + 1).trim();
			serviceIRCTransaction(prefix.substring(0, prefix.indexOf('!')), prefix, command, destination, params);
		} catch (Exception e)
		{
		}
	}

	/**
	 * Process an IRC Transaction
	 * @param destination String nickname of the user who sentence the message
	 * @param message String the command
	 *     params are in the form
	 *     <my nick> :<message>
	 *     or
	 *     <my nick> <message>
	 */
	@Override
	public void serviceIRCTransaction(String from, String hostmask, String command, String destination, String params)
	{
		if (hostmask.startsWith(ircNick)) return;
		if (command.equalsIgnoreCase("PRIVMSG")) servicePublicMessage(from, hostmask, destination, params.trim());
	}

	/**
	 * Process a Public message (PRIVMSG to Channel)
	 * @param destination String nickname of the user who sentence the message
	 * @param message String the command
	 *     params are in the form
	 *     <my nick> :<message>
	or
	<my nick> <message>
	 */
	@Override
	public void servicePublicMessage(String from, String hostmask, String returnpath, String params)
	{
		if (!returnpath.startsWith("#")) returnpath = from;
		String lcparams = params.trim();
		int ccol = params.indexOf(':');
		if (ccol < 0) ccol = params.indexOf(' ');
		if (ccol > 1)
		{
			String token = lcparams.substring(0, ccol).trim();
			params = params.substring(ccol + 1).trim();
			if (serviceToken(from, hostmask, returnpath, token, params)) return;
		}
		else
		{
			if (serviceToken(from, hostmask, returnpath, lcparams, params)) return;
		}
		serviceChatter(from, hostmask, params, returnpath);
	}

	/**
	 * Process a Token message
	 * @param destination String nickname of the user who sentence the message
	 * @param message String the command
	 *     params are in the form
	 *     <my nick> :<message>
	 *     or
	 *     <my nick> <message>
	 */
	@Override
	public boolean serviceToken(String from, String hostmask, String returnpath, String token, String params)
	{
		System.out.println("token: '" + token + "' params: '" + params + "'");
		if (token.equals("hello"))
		{
			sendMessage(returnpath, "hello " + from);
			return true;
		}
		if (token.equals("time"))
		{
			sendMessage(returnpath, "the time was " + (new Date()).toString());
			return true;
		}
		if (token.equals("restart"))
		{
			restartChatterBot();
			return true;
		}
		if (token.equals("help"))
		{
			sendHelp(returnpath, params);
			return true;
		}
		if (token.equals("echo"))
		{
			sendMessage(returnpath, params);
			return true;
		}
		if (token.equals("cyclify"))
		{
			sendMessage(returnpath, toCycListString(params));
			return true;
		}
		if (token.equals("paraphrase"))
		{
			if (params.startsWith("#"))
			{
				paraphrased.add(params);
				return true;
			}
			sendMessage(returnpath, attemptParaphrase(toCycList(params)));
			return true;
		}
		if (token.equals("noparaphrase"))
		{
			paraphrased.remove(params);
			return true;
		}
		if (token.equals("subl"))
		{
			if (!from.equals(ircDebug))
			{
				sendMessage(returnpath, "No subl from " + from);
			}
			else
			{
				serviceSubL(from, returnpath, params);
			}
			return true;
		}
		if (token.equals("debug"))
		{
			ircDebug = params;
			return true;
		}
		if (token.equals("ask"))
		{
			serviceQuery(from, returnpath, params);
			return true;
		}
		if (token.equals("beliefs"))
		{
			serviceBeliefs(from, returnpath, params);
			return true;
		}
		if (token.equals("mt"))
		{
			try
			{
				CycConstant mt = cyc.makeCycConstant(params);
				cyc.assertIsa(mt, cyc.makeCycConstant("#$Microtheory"), baseKB);
				mtUser.put(from, mt);
			} catch (Exception e)
			{
			}
			return true;
		}
		if (token.equals("bsh"))
		{
			try
			{
				if (bshObj != null)
				{
					sendMessage(returnpath, bshInv.invoke(bshObj, new Object[] { params }));
				}
			} catch (Exception e)
			{
				sendMessage(returnpath, e);
			}
			return true;
		}
		if (token.equals("prove"))
		{
			serviceProve(from, returnpath, params);
			return true;
		}
		if (token.equals("query"))
		{
			serviceQueryUser(from, returnpath, params);
			return true;
		}
		if (token.equals("assert"))
		{
			serviceAssert(from, returnpath, params); // cyclist, returnpath, sentence
			return true;
		}
		if (token.equals("join"))
		{
			if (from.equals(ircDebug))
			{
				ircJoin(params);
			}
			return true;
		}
		if (token.equals("verbose"))
		{
			if (from.equals(ircDebug))
			{
				verbosity = Strings.toInt(Strings.word(params, 0));
				sendMessage(from, "Verbosity now is " + verbosity);
			}
			return true;
		}
		if (token.startsWith("part"))
		{
			if (from.equals(ircDebug))
			{
				ircPart(params);
			}
			return true;
		}
		if (token.startsWith("putserv"))
		{
			ircSend(params);
			return true;
		}
		// Describe
		if (token.startsWith("desc"))
		{
			serviceDescribe(from, returnpath, params);
			return true;
		}
		// Additions for scripts
		if (token.startsWith("story"))
		{
			serviceStartListeningToStory(from, returnpath, params);
			return true;
		}
		if (token.startsWith("oldstory"))
		{
			try
			{
				CycConstant story = cyc.getKnownConstantByName(params);
				if (!cyc.isa((CycFort) story, (CycFort) cyc.getKnownConstantByName("#$Story"), (CycFort) mtForUser(from)))
				{
					sendMessage(returnpath, params + " is not a #$Story");
				}
				else
				{
					makeSenseOfStory(from, returnpath, story);
				}
			} catch (Exception e)
			{
				sendMessage(returnpath, "" + e);
			}
			return true;
		}
		if (token.startsWith("whatsnextin"))
		{
			try
			{
				CycConstant story = cyc.getKnownConstantByName(params);
				if (!cyc.isa((CycFort) story, (CycFort) cyc.getKnownConstantByName("#$Story"), (CycFort) mtForUser(from)))
				{
					sendMessage(returnpath, params + " is not a #$Story");
				}
				else
				{
					possibleNextActsAndStates(from, returnpath, story);
				}
			} catch (Exception e)
			{
				sendMessage(returnpath, "" + e);
			}
			return true;
		}
		if (token.startsWith("currentstory"))
		{
			serviceShowCurrentStory(from, returnpath, params);
			return true;
		}
		if (token.startsWith("expected"))
		{
			sendMessage(returnpath, expectedFromUser(from));
			return true;
		}
		if (token.startsWith("wat") && params.equals("nu?"))
		{
			try
			{
				sendMessage(returnpath, "eeeeeeeeeeeee..............");
				Thread.sleep(3000);
				sendMessage(returnpath, "\n");
				sendMessage(returnpath, "BIERTJUH??");
				return true;
			} catch (Exception e)
			{
			}
		}
		// if the user is telling a story... lets listen.
		String expected = expectedFromUser(from);
		if (expected.length() > 0)
		{
			// is a primitive act expected?
			serviceExpectation(from, returnpath, token, params);
			//            sendMessage(returnpath, "I expect something" );
		}

		if (servicePlugin(from, hostmask, returnpath, token, params)) return true;
		return false;
	}

	@Override
	public boolean servicePlugin(String from, String hostmask, String returnpath, String token, String params)
	{
		return false;
	}

	/*public Object bshObj;
	public Method bshInv;
	public Method bshSet;
	public Class bshcls;*/

	@Override
	public void startPlugins()
	{
		try
		{
			bshcls = Class.forName("bsh.Interpreter");
			bshObj = bshcls.newInstance();
			bshInv = bshcls.getMethod("eval", new Class[] { String.class });
			bshSet = bshcls.getMethod("set", new Class[] { String.class, Object.class });
			addObj("client", this);
			addObj("cyc", cyc);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return;
	}

	@Override
	public void addObj(String name, Object val)
	{
		try
		{
			bshSet.invoke(bshObj, new Object[] { name, val });
		} catch (Exception e)
		{
		}
	}

	@Override
	public void sendHelp(String returnpath, String params)
	{
		sendMessage(returnpath, "usage: help <hello|time|desc|ask|query|assert|cyclify>");
		sendMessage(returnpath, "and <story|currentstory|expected|abort|beliefs>");
		sendMessage(returnpath, "and <oldstory|whatsnextin>");
		sendMessage(returnpath, "ask = cyc-query in #$InferencePSC, query = cyc-query in " + mtForUser(returnpath));
	}

	/**
	 * Process a SubL command
	 * @param destination String nickname of the user who sent the message
	 * @param message String the command
	 * params are in the form
	 * <my nick> :<message>
	 * or
	 * <my nick> <message>
	 */
	@Override
	public void serviceSubL(String cyclist, String returnpath, String subl)
	{
		try
		{
			sendAnswers(returnpath, cyc.converseObject(subl));
		} catch (Exception e)
		{
			sendMessage(returnpath, "" + e /*  + "\" " + " trying to eval \"" + subl +
										   "\" " + "from \"" + cyclist + "\" with returnpath \""+returnpath + "\""*/ );
		}
	}

	/**
	 * Describe something
	 * @param cyclist -> the name of the askwer
	 * @param returnpath -> the channel to send the answer to
	 * @param params -> what is asked to describe.
	 */
	public void serviceDescribe(String cyclist, String returnpath, String params)
	{
		try
		{
			/*--------------------------------------------------------------------------
			 * The first word of the params is the subject.
			 *-------------------------------------------------------------------------*/
			CycFort subject = (CycFort) cyc.getKnownConstantByName(Strings.word(params, 0));
			/*--------------------------------------------------------------------------
			 * Print the isas.
			 *-------------------------------------------------------------------------*/
			sendMessage(returnpath, "isas: " + Strings.stripBlanks(Strings.translate(cyc.getIsas(subject).toString(), "()", "")));
			/*--------------------------------------------------------------------------
			 * Print the comments.
			 *-------------------------------------de------------------------------------*/
			String comments = cyc.getComment(subject);
			sendMessage(returnpath, "comment: " + Strings.subWords(comments, 0, 20) + (Strings.numWords(comments) > 20 ? "..." : ""));
			/*--------------------------------------------------------------------------
			 * (?PRED subject ?THING)
			 *-------------------------------------------------------------------------*/
			CycList query = new CycList();
			CycList results;
			/**            CycVariable relVar = CycObjectFactory.makeCycVariable("?PRED");
			CycVariable thingVar = CycObjectFactory.makeCycVariable("?THING");
			
			query.add(relVar);
			query.add(subject);
			query.add(thingVar);
			
			ArrayList variables = new ArrayList();
			variables.add(relVar);
			variables.add(thingVar);
			results = cyc.askWithVariables(query, variables, mtForUser(cyclist));
			**/
			/*--------------------------------------------------------------------------
			 * Print each result.
			 *-------------------------------------------------------------------------*/
			//                for (int i = 0; i < results.size(); i++) {
			//                    sendMessage(returnpath, results.get(i).toString() );
			//                }
			/*--------------------------------------------------------------------------
			 * If it isa Script, get the subscripts. (cannot use cyc.isa( subject, "Script" ) -> works only on direct isas
			 *-------------------------------------------------------------------------*/
			if (cyc.isQueryTrue(cyc.makeCycList("(#$isa " + subject.stringApiValue() + " #$Script)"), mtForUser(cyclist)))
			{
				/*--------------------------------------------------------------------------
				 * get the subscripts.
				 *-------------------------------------------------------------------------*/
				query = cyc.makeCycList("(#$subScripts " + subject.stringApiValue() + " ?SUBSCRIPT)");
				CycVariable subVar = CycObjectFactory.makeCycVariable("?SUBSCRIPT");
				results = cyc.askWithVariable(query, subVar, mtForUser(cyclist));
				if (results.size() > 1) sendMessage(returnpath, "subScripts: ");
				//                for (int i = 0; i < results.size(); i++) {
				//                    if( !Strings.equals( results.get(i).toString(), subject.toString(), false ) )      // subScripts is reflexive, so don't show self.
				//                        sendScriptRoles( cyclist, returnpath, (CycFort)results.get(i) );
				//                }
				Iterator it = results.iterator();
				;
				while (it.hasNext())
				{
					CycFort result = (CycFort) it.next();
					if (!Strings.equals(result.toString(), subject.toString(), false)) // subScripts is reflexive, so don't show self.
						sendScriptRoles(cyclist, returnpath, (CycFort) result);
				}
				/*--------------------------------------------------------------------------
				 * get the superscripts.
				 *-------------------------------------------------------------------------*/
				query = cyc.makeCycList("(#$subScripts ?SUPERSCRIPT " + subject.stringApiValue() + ")");
				CycVariable superVar = CycObjectFactory.makeCycVariable("?SUPERSCRIPT");
				results = cyc.askWithVariable(query, superVar, mtForUser(cyclist));
				if (results.size() > 1) sendMessage(returnpath, "subScript of: ");
				for (int i = 0; i < results.size(); i++)
				{
					if (!Strings.equals(results.get(i).toString(), subject.toString(), false)) // subScripts is reflexive, so don't show self.
						sendScriptRoles(cyclist, returnpath, (CycFort) results.get(i));
				}
			}

		} catch (Exception e)
		{
			sendMessage(returnpath, "" + e);
		}
	}

	public void sendScriptRoles(String cyclist, String returnpath, CycFort script)
	{
		try
		{
			/*--------------------------------------------------------------------------
			 * Print script name + Get all scriptRoleIsas and print them
			 *-------------------------------------------------------------------------*/
			String result = "Script: " + script.toString();

			/*--------------------------------------------------------------------------
			 * Get all scriptACTs
			 *-------------------------------------------------------------------------*/
			CycList query = cyc.makeCycList("(#$scriptACT " + script.stringApiValue() + " ?ACT)");
			CycVariable actVar = CycObjectFactory.makeCycVariable("?ACT");
			CycList results = cyc.askWithVariable(query, actVar, mtForUser(cyclist));
			for (int i = 0; i < results.size(); i++)
			{
				result = result + " act:" + results.get(i).toString();
			}
			/*--------------------------------------------------------------------------
			 * Get all scriptRoleIsas
			 *-------------------------------------------------------------------------*/
			query = cyc.makeCycList("(#$scriptRoleIsa (#$ScriptRoleFn " + script.stringApiValue() + " ?ROLE) ?COL)");
			CycVariable roleVar = CycObjectFactory.makeCycVariable("?ROLE");
			CycVariable colVar = CycObjectFactory.makeCycVariable("?COL");

			ArrayList variables = new ArrayList();
			variables.add(roleVar);
			variables.add(colVar);

			Iterator isas = cyc.askWithVariables(query, variables, mtForUser(cyclist)).iterator();
			if (isas.hasNext()) result = result + "\n-scriptRoleIsas: " + isas.next().toString();
			while (isas.hasNext())
			{
				result = result + isas.next().toString();
			}
			/*--------------------------------------------------------------------------
			 * Get all rolesForScript
			 *-------------------------------------------------------------------------*/
			query = cyc.makeCycList("(#$rolesForScript " + script.stringApiValue() + " ?ROLE)");
			Iterator roles = cyc.askWithVariable(query, roleVar, mtForUser(cyclist)).iterator();
			if (roles.hasNext()) result = result + "\n-rolesForScript: ";
			boolean meer = false;
			while (roles.hasNext())
			{
				if (meer) result = result + ", ";
				try
				{
					CycConstant role = (CycConstant) roles.next();
					result = result + role.toString();
					meer = true;
					/*--------------------------------------------------------------------------
					 * Get script role equals
					 *-------------------------------------------------------------------------*/
					query = cyc.makeCycList("(#$and (#$equals (#$ScriptRoleFn " + script.stringApiValue() + " " + role.stringApiValue() + ")(#$ScriptRoleFn ?S ?R))" + "(#$not (#$equals ?S " + script.stringApiValue() + "))(#$not (#$equals ?R " + role.stringApiValue() + ")))");
					CycVariable sVar = CycObjectFactory.makeCycVariable("?S");
					CycVariable rVar = CycObjectFactory.makeCycVariable("?R");
					ArrayList vars = new ArrayList();
					vars.add(sVar);
					vars.add(rVar);
					Iterator eqs = cyc.askWithVariables(query, vars, mtForUser(cyclist)).iterator();
					if (eqs.hasNext()) result = result + " equals ";
					boolean eerste2 = true;
					while (eqs.hasNext())
					{
						CycList equal = (CycList) eqs.next();
						if (!eerste2)
						{
							result = result + ", ";
							eerste2 = false;
						}
						result = result + equal.toString();
					}
				} catch (Exception e)
				{
				}
			}
			sendMessage(returnpath, result);
		} catch (Exception e)
		{
			sendMessage(returnpath, "" + e);
		}
	}

	/**
	 * Process a Query command
	 * @param destination String nickname of the user who sentence the message
	 * @param message String the command
	 *     params are in the form
	 *     <my nick> :<message>
	 *     or
	 *     <my nick> <message>
	 */
	@Override
	public void serviceQuery(String cyclist, String returnpath, String query)
	{
		try
		{
			sendMessage(returnpath, cyc.converseObject("(cyc-query '" + toCycListString(query) + " #$InferencePSC)"));
		} catch (Exception e)
		{
			sendMessage(returnpath, "" + e);
		}
	}

	/**
	 * Process a beliefs command
	 */
	public void serviceBeliefs(String cyclist, String returnpath, String query)
	{
		try
		{
			//            sendAnswers(returnpath, cyc.converseObject( "(cyc-query '(#$beliefs #$ScriptBot " +toCycListString(query)
			//                + ") " + mtForUser(cyclist).stringApiValue() + " '(:backchain 1 :time 60))"));
			sendAnswers(returnpath, cyc.converseObject("(cyc-query '" + toCycListString(query) + cyc.getKnownConstantByName("ScriptBotBeliefsMt").stringApiValue() + " '(:backchain 1 :time 60))"));
		} catch (Exception e)
		{
			sendMessage(returnpath, "" + e);
		}
	}

	/**
	 * Process a Prove command (Query with proof)
	 * @param destination String nickname of the user who sent the message
	 * @param message String the command
	 * params are in the form
	 * <my nick> :<message>
	 * or
	 * <my nick> <message>
	 */
	@Override
	public void serviceProve(String cyclist, String returnpath, String query)
	{
		try
		{
			sendAnswers(returnpath, cyc.converseObject("(fi-prove '" + toCycListString(query) + " #$InferencePSC)"));
		} catch (Exception e)
		{
			sendMessage(returnpath, "" + e);
		}
	}

	/**
	 * Process an Ask command
	 * @param destination String nickname of the user who sentence the message
	 * @param message String the command
	 * params are in the form
	 * <my nick> :<message>
	 * or
	 * <my nick> <message>
	 */
	@Override
	public void serviceQueryUser(String cyclist, String returnpath, String query)
	{
		try
		{
			sendAnswers(returnpath, cyc.converseObject("(cyc-query '" + toCycListString(query) + " " + mtForUser(cyclist).stringApiValue() + ")"));
		} catch (Exception e)
		{
			sendMessage(returnpath, "" + e);
		}
	}

	/**
	 * Process an Assert command
	 * @param destination String nickname of the user who sentence the message
	 * @param message String the command
	 * params are in the form
	 * assert:<message>
	 * or
	 * <my nick>  <message>
	 */
	@Override
	public void serviceAssert(String cyclist, String returnpath, String sentence)
	{
		serviceSubL(cyclist, returnpath, "(cyc-assert '" + toCycListString(sentence) + " " + mtForUser(cyclist).stringApiValue() + ")");
	}

	/**
	* Process an Assert command
	* @param destination String nickname of the user who sentence the message
	* @param message String the command
	*  params are in the form
	*  assert:<message>
	*  or
	*  <my nick>  <message>
	*/
	@Override
	public void serviceChatter(String cyclist, String identity, String message, String returnpath)
	{
		ircDestination = returnpath;
		return;

		//	try {
		//          if ( chatterBot!=null ) chatterBot.receiveChatMessage(cyclist, cyclist    /*identity hostmask?*/,message);
		//	} catch ( Exception e ) {
		//	    e.printStackTrace(System.out);
		// sendDebug(""+e);
		//	}
	}

	//public HashMap mtUser = new HashMap();

	/**
	 * Returns a Mt for a user
	 */
	@Override
	public CycFort mtForUser(String cyclist)
	{
		CycConstant mt = (CycConstant) mtUser.get(cyclist);
		if (mt == null)
		{
			try
			{
				// make <from>ChatMt
				mt = cyc.makeCycConstant("#$" + cyclist + "ChatMt");
				// isa <from>ChatMt Microtheory
				cyc.assertIsa(mt, cyc.makeCycConstant("#$Microtheory"), baseKB);
				// genlMt <from>chatMt SPGUTestDataMt and ScriptBotMt
				cyc.assertGaf(universalVocabularyMt, genlMt, mt, cyc.getKnownConstantByName("#$SPGUTestDataMt"));
				cyc.assertGaf(universalVocabularyMt, genlMt, mt, cyc.getKnownConstantByName("#$ScriptBotMt"));
				cyc.assertGaf(universalVocabularyMt, genlMt, mt, cyc.getKnownConstantByName("#$RegelingPGBScriptMt"));
				cyc.assertGaf(universalVocabularyMt, genlMt, mt, cyc.getKnownConstantByName("#$RegelingPGBDataMt"));
				// genlMt ScriptBotBeliefsMt <from>chatMt
				cyc.assertGaf(universalVocabularyMt, genlMt, cyc.getKnownConstantByName("#$ScriptBotBeliefsMt"), mt);
				// make <from>Chatter
				CycConstant chatter = cyc.makeCycConstant("#$" + cyclist + "Chatter");
				// isa <from>Chatter Person                
				cyc.assertIsa(chatter, cyc.getKnownConstantByName("#$Person"), mt);
			} catch (Exception e)
			{
				mt = (CycConstant) baseKB;
			}
			if (verbosity > 1) sendMessage(ircDestination, "(Using microtheory: " + mt.cyclify() + " for assertions until " + cyclist + " types \"mt <something>\")");
			mtUser.put(cyclist, mt);
		}
		return (CycFort) mt;
	}

	/***********************************************
	 *
	 * Story from user.
	 */
	public HashMap userStories = new HashMap();

	public CycList storyFromUser(String cyclist)
	{
		CycList userStory = (CycList) userStories.get(cyclist);
		if (userStory == null)
		{
			try
			{
				userStory = (CycList) cyc.makeCycList((String) "(#$and)");
				CycList thestory = (CycList) cyc.makeCycList((String) "(#$isa ?STORY #$Story)");
				userStory.add(thestory);
				userStories.put(cyclist, userStory);
			} catch (Exception e)
			{
				sendMessage(ircDestination, "cannot make cyclist for story " + e);
			}
		}
		return (CycList) userStory;
	}

	/***********************************************
	 *
	 * current event (variable) from user
	 */
	public HashMap userEventVariable = new HashMap();

	/***********************************************
	 *
	 * Expected thing from user.
	 */
	public HashMap expectedThings = new HashMap();

	public String expectedFromUser(String cyclist)
	{
		String expectedThing = (String) expectedThings.get(cyclist);
		return (String) expectedThing;
	}

	/***********************************************
	 *
	 * Process a story command
	 * 
	 * If the user does not yet have a story, make it (by the first call to storyFromUser)
	 * else display a warning message.
	 */
	public void serviceStartListeningToStory(String cyclist, String returnpath, String query)
	{
		try
		{
			CycList userStory = (CycList) userStories.get(cyclist);
			if (userStory == null)
			{
				userStory = storyFromUser(cyclist);
				expectedThings.put(cyclist, "primitiveact");
				sendMessage(returnpath, cyclist + " tells a story. What's the first primitive act?");
			}
			else
			{
				sendMessage(returnpath, cyclist + " is already telling a story.");
			}
		} catch (Exception e)
		{
			sendMessage(returnpath, "" + e);
		}
	}

	public int storynumber = 1;

	/***********************************************
	 *
	 * Display the current story
	 *
	 */
	public void serviceShowCurrentStory(String cyclist, String returnpath, String query)
	{
		try
		{
			CycList userStory = (CycList) userStories.get(cyclist);
			if (userStory == null)
			{
				sendMessage(returnpath, cyclist + " is not telling a story.");
			}
			else
			{
				sendMessage(returnpath, userStory.toString());
			}
		} catch (Exception e)
		{
			sendMessage(returnpath, "" + e);
		}
	}

	/***********************************************
	 *
	 * Step 2 of making sense of a story... find candidate script for the story.
	 * This is very simple. (iets doen met salient role for script.)
	 */
	public void findScriptCandidates(String cyclist, String returnpath, CycConstant story)
	{
		try
		{
			/*--------------------------------------------------------------------------
			 * what are the subevents of the story?
			 *-------------------------------------------------------------------------*/
			CycList query = new CycList();
			CycVariable eventVar = CycObjectFactory.makeCycVariable("?EVENT");
			query.add(cyc.getKnownConstantByName("subEvents"));
			query.add(story);
			query.add(eventVar);
			/*--------------------------------------------------------------------------
			 * The query for the superscripts.
			 *-------------------------------------------------------------------------*/
			CycList qfss = new CycList(); // query for super scripts
			CycVariable svar = CycObjectFactory.makeCycVariable("?SCRIPT");
			// qfss = e.g. (and (subScripts ?X RSAtomicScene3)(subScripts ?X RSAtomicScene1))
			qfss.add(and);
			/*--------------------------------------------------------------------------
			 * The assertion for story reference belief.
			 * This assertion will be added to ScriptBotBeliefsMt
			 *-------------------------------------------------------------------------*/
			CycList beliefs = new CycList(); // query for super scripts
			// qfss = e.g. (and (subScripts ?X RSAtomicScene3)(subScripts ?X RSAtomicScene1))
			beliefs.add(and);
			/*--------------------------------------------------------------------------
			 * For each subevent, is there a script related (#$scriptACT) to it's eventtype?
			 *-------------------------------------------------------------------------*/
			CycList subEvents = cyc.askWithVariable(query, eventVar, mtForUser(cyclist));
			for (int i = 0; i < subEvents.size(); i++)
			{
				//           sendMessage(returnpath, "(subevent " + subEvents.get(i).toString() + ")" );

				CycList scriptsQuery = new CycList();
				scriptsQuery.add(and);

				// (isa SubEvent ?EVENTTYPE)
				CycVariable eventTypeVar = CycObjectFactory.makeCycVariable("?EVENTTYPE");
				CycList subQuery = new CycList();
				subQuery.add(isa);
				subQuery.add(subEvents.get(i));
				subQuery.add(eventTypeVar);
				scriptsQuery.add(subQuery);
				// (scriptACT ?SCRIPT ?EVENTTYPE))
				CycVariable scriptVar = CycObjectFactory.makeCycVariable("?SCRIPT");
				CycList subQuery2 = new CycList();
				subQuery2.add(cyc.getKnownConstantByName("scriptACT"));
				subQuery2.add(CycObjectFactory.makeCycVariable("?SCRIPT"));
				subQuery2.add(eventTypeVar);
				scriptsQuery.add(subQuery2);
				//          sendMessage(returnpath, scriptsQuery.toString() );
				// query = (and (isa <subevent> ?EVENTTYPE)(scriptAct ?SCRIPT ?EVENTTYPE))
				CycList scripts = cyc.askWithVariable(scriptsQuery, scriptVar, mtForUser(cyclist));
				for (int j = 0; j < scripts.size(); j++)
				{
					/*--------------------------------------------------------------------------
					 * For each possible referenced script, try to match a role of the event
					 * with the scriptRoleIsa
					 * For example; 
					 *-------------------------------------------------------------------------*/
					// (and (isa ?ROLE BinaryRolePredicate)
					//   (?ROLE <subevent-i> ?CD-PP)
					//   (scriptRoleIsa <script-j> ?ROLE ?COL)
					//   (isa ?CD-PP ?COL))
					CycVariable ppVar = CycObjectFactory.makeCycVariable("?CD-PP");
					CycVariable colVar = CycObjectFactory.makeCycVariable("?COL");
					CycVariable roleVar = CycObjectFactory.makeCycVariable("?ROLE");
					CycList query3 = new CycList();
					query3.add(cyc.and);
					query3.add(cyc.makeCycList((String) "(#$isa ?ROLE #$BinaryRolePredicate)"));
					// (?ROLE <subevent-i> ?CD-PP)
					CycList subQuery3 = new CycList();
					subQuery3.add(roleVar);
					subQuery3.add(subEvents.get(i));
					subQuery3.add(ppVar);
					query3.add(subQuery3);
					// (scriptRoleIsa <script-j ?ROLE ?COL)
					CycList subQuery4 = cyc.makeCycList("(#$scriptRoleIsa (#$ScriptRoleFn " + ((CycConstant) scripts.get(j)).stringApiValue() + " ?ROLE) ?COL)");
					query3.add(subQuery4);
					// (isa ?CD-PP ?COL)
					CycList subQuery5 = new CycList();
					subQuery5.add(cyc.isa);
					subQuery5.add(ppVar);
					subQuery5.add(colVar);
					query3.add(subQuery5);
					//                    sendMessage(returnpath, query3.toString() );
					if (verbosity > 2) sendMessage(returnpath, "(script for " + subEvents.get(i).toString() + ": " + scripts.get(j).toString() + ")");
					// *!*!*!*! dit is weer op 0 gezet is dit nodig? met backchainsteps 1 ??
					CycList roles = cyc.askWithVariable(query3, roleVar, mtForUser(cyclist), "1 1");
					//                    CycList roles = cyc.askWithVariable(query3, roleVar, mtForUser(cyclist));
					Iterator roleIt = roles.iterator();
					;
					/*--------------------------------------------------------------------------
					 * For each found combination
					 *-------------------------------------------------------------------------*/
					while (roleIt.hasNext())
					{
						CycConstant role = (CycConstant) roleIt.next();
						// additions to superscript query (with subScript predicate)
						CycList subscript = new CycList();
						subscript.add(cyc.getKnownConstantByName("subScripts"));
						subscript.add(svar);
						subscript.add(scripts.get(j));
						qfss.add(subscript);
						// additions to beliefs assertion
						CycList belief = new CycList();
						belief.add(cyc.getKnownConstantByName("storyReferences"));
						belief.add(subEvents.get(i));
						belief.add(scripts.get(j));
						beliefs.add(belief);
						// some verbosity 
						if (verbosity > 1) sendMessage(returnpath, "(script and role match for subevent " + subEvents.get(i).toString() + ", script " + scripts.get(j).toString() + ", role " + role.toString() + ")");
					} // match with scriptRoleIsa
				} // script related via scriptISA
			} // for each subevent

			/*--------------------------------------------------------------------------
			 * Get the superscripts.
			 *-------------------------------------------------------------------------*/
			CycList superscripts = cyc.askWithVariable(qfss, svar, mtForUser(cyclist));
			Iterator ssIt = superscripts.iterator();
			;
			/*--------------------------------------------------------------------------
			 * For each found combination
			 *-------------------------------------------------------------------------*/
			while (ssIt.hasNext())
			{
				CycConstant superscript = (CycConstant) ssIt.next();
				/*--------------------------------------------------------------------------
				 * If all the subevents share a common references superscript, there will
				 * be a result here. (what will happen if there are two referenced scripts?)
				 * assert (beliefs ScriptBot (storyReferences SubEvent SubScript)) and
				 * (beliefs ScriptBot (storyReferences Story Superscript))
				 *-------------------------------------------------------------------------*/
				// (storyReferences Story Superscript)
				CycList belief = new CycList();
				belief.add(cyc.getKnownConstantByName("storyReferences"));
				belief.add(story);
				belief.add(superscript);
				// add it to the other beliefs (storyReferences Subevent Subscript)
				beliefs.add(belief);
				// assert it in ScriptBotBeliefsMt
				serviceSubL(cyclist, returnpath, "(cyc-assert '" + beliefs.stringApiValue() + " " + cyc.getKnownConstantByName("ScriptBotBeliefsMt").stringApiValue() + ")");
				// print it
				if (verbosity > 1) sendMessage(returnpath, beliefs.toString());
			}

		} catch (Exception e)
		{
			sendMessage(returnpath, "" + e);
		}
	}

	/***********************************************
	 *
	 * Make sense of a story.
	 * 
	 */
	public void makeSenseOfStory(String cyclist, String returnpath, CycConstant story)
	{
		try
		{
			if (verbosity > 1) sendMessage(returnpath, "story = " + story.toString());
			if (verbosity > 1) sendMessage(returnpath, "Making sense step 2: find candidates for referenced scripts.");
			findScriptCandidates(cyclist, returnpath, story);
			if (verbosity > 1) sendMessage(returnpath, "Making sense step 3: repropagate role fillers for incomplete events.");
			repropRoles(cyclist, returnpath, story);
			if (verbosity > 1) sendMessage(returnpath, "Making sense step 4: hypothesize required role fillers.");
			hypothesizeRequiredRoleFillers(cyclist, returnpath, story);
			//           sendMessage( returnpath, "ask me what i believe" );
			sendMessage(returnpath, cyclist + " finished the story, ready to answer questions about it.");
		} catch (Exception e)
		{
			sendMessage(returnpath, "" + e);
		}
	}

	public void touchAssertion(String returnpath, int assertion_id)
	{
		try
		{
			URL url = new URL("http://devwww.portavita.nl:3602/cgi-bin/cyccgi/cg?cb-repropagate&" + assertion_id);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			//            con.setDoOutput(true);
			con.setDoInput(true);
			con.setRequestMethod("GET");
			//            con.setRequestProperty("Content-length", String.valueOf(bytes.length));

			// Read the response
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			while (true)
			{
				String line = in.readLine();
				if (line == null) break;
				System.out.println(line);
			}
			in.close();
			//            out.close();
			con.disconnect();
		} catch (Exception e)
		{
			sendMessage(returnpath, "" + e);
		}
	}

	/***********************************************
	 *
	 * Step 3... find role fillers for a story.
	 * There exists a forward rule that uses #$roleFillerEquals.
	 * the consequent of these rules will be called for the story.
	 */
	public void repropRoles(String cyclist, String returnpath, CycConstant story)
	{
		try
		{
			if (verbosity > 8) sendMessage(returnpath, "first");
			touchAssertion(returnpath, 167863);
			/***
			//            cyc.converseObject("(FI-REASSERT '(#$implies (#$and (#$scriptRoleIsa (#$TLVariableFn 0 \"?SCRIPT2\") (#$TLVariableFn 1 \"?ROLE2\") (#$TLVariableFn 2 \"?COL\")) (#$roleFillerEquals (TLVariableFn 3 \"?SCRIPT1\") (#$TLVariableFn 4 \"?ROLE1\") (#$TLVariableFn 0 \"?SCRIPT2\") (#$TLVariableFn 1 \"?ROLE2\"))) (#$scriptRoleIsa (#$TLVariableFn 3 \"?SCRIPT1\") (#$TLVariableFn 4 \"?ROLE1\") (#$TLVariableFn 2 \"?COL\"))) #$SPGUMt ':DEFAULT ':FORWARD)" );
			if( verbosity > 1 ) sendMessage( returnpath, "second" ); 
			touchAssertion( returnpath, 165753 );
			//            cyc.converseObject("(FI-REASSERT '(implies (and (scriptRoleIsa (TLVariableFn 0 \"?SCRIPT1\") (TLVariableFn 1 \"?ROLE1\") (TLVariableFn 2 \"?COL\")) (roleFillerEquals (TLVariableFn 0 \"?SCRIPT1\") (TLVariableFn 1 \"?ROLE1\") (TLVariableFn 3 \"?SCRIPT2\") (TLVariableFn 4 \"?ROLE2\"))) (scriptRoleIsa (TLVariableFn 3 \"?SCRIPT2\") (TLVariableFn 4 \"?ROLE2\") (TLVariableFn 2 \"?COL\"))) '#$SPGUMt ':DEFAULT ':FORWARD)" );
			if( verbosity > 1 ) sendMessage( returnpath, "third" ); 
			touchAssertion( returnpath, 165514 );
			//            cyc.setCyclist( "CycAdministrator" );
			//            CycList assertThis = cyc.makeCycList( "(#$implies (#$and (#$storyReferences ?EVENT1 ?SCRIPT1) (#$subEvents ?STORY ?EVENT1) (#$subEvents ?STORY ?EVENT2) (#$storyReferences ?EVENT2 ?SCRIPT2) (?ROLE2 ?EVENT2 ?THING) (#$roleFillerEquals ?SCRIPT1 ?ROLE1 ?SCRIPT2 ?ROLE2)) (?ROLE1 ?EVENT1 ?THING))" );
			//            cyc.converseObject("(FI-ASSERT '" + assertThis.stringApiValue() + " #$SPGUMt ':DEFAULT ':FORWARD)" );
			//            cyc.converseObject("(FI-REASSERT '(implies (and (storyReferences (TLVariableFn 0 \"?EVENT1\") (TLVariableFn 1 \"?SCRIPT1\")) (subEvents (TLVariableFn 2 \"?STORY\") (TLVariableFn 0 \"?EVENT1\")) (subEvents (TLVariableFn 2 \"?STORY\") (TLVariableFn 3 \"?EVENT2\")) (storyReferences (TLVariableFn 3 \"?EVENT2\") (TLVariableFn 4 \"?SCRIPT2\")) ((TLVariableFn 5 \"?ROLE2\") (TLVariableFn 3 \"?EVENT2\") (TLVariableFn 6 \"?THING\")) (roleFillerEquals (TLVariableFn 1 \"?SCRIPT1\") (TLVariableFn 7 \"?ROLE1\") (TLVariableFn 4 \"?SCRIPT2\") (TLVariableFn 5 \"?ROLE2\"))) ((TLVariableFn 7 \"?ROLE1\") (TLVariableFn 0 \"?EVENT1\") (TLVariableFn 6 \"?THING\"))) '#$SPGUMt ':DEFAULT ':FORWARD)" );
			//            cyc.converseObject("(FI-REASSERT '(implies (and (storyReferences (TLVariableFn 0 \"?EVENT1\") (TLVariableFn 1 \"?SCRIPT1\")) (subEvents (TLVariableFn 2 \"?STORY\") (TLVariableFn 0 \"?EVENT1\")) (subEvents (TLVariableFn 2 \"?STORY\") (TLVariableFn 3 \"?EVENT2\")) (storyReferences (TLVariableFn 3 \"?EVENT2\") (TLVariableFn 4 \"?SCRIPT2\")) ((TLVariableFn 5 \"?ROLE1\") (TLVariableFn 0 \"?EVENT1\") (TLVariableFn 6 \"?THING\")) (roleFillerEquals (TLVariableFn 1 \"?SCRIPT1\") (TLVariableFn 5 \"?ROLE1\") (TLVariableFn 4 \"?SCRIPT2\") (TLVariableFn 7 \"?ROLE2\"))) ((TLVariableFn 7 \"?ROLE2\") (TLVariableFn 3 \"?EVENT2\") (TLVariableFn 6 \"?THING\"))) '#$SPGUMt ':DEFAULT ':FORWARD)" );
			if( verbosity > 1 ) sendMessage( returnpath, "fourth" ); 
			touchAssertion( returnpath, 165513 );
			//http://devwww.portavita.nl:3602/cgi-bin/cyccgi/cg?cb-repropagate&165513
			//            assertThis = cyc.makeCycList( "(#$implies (#$and (#$storyReferences ?EVENT1 ?SCRIPT1) (#$subEvents ?STORY ?EVENT1) (#$subEvents ?STORY ?EVENT2) (#$storyReferences ?EVENT2 ?SCRIPT2) (?ROLE1 ?EVENT1 ?THING) (#$roleFillerEquals ?SCRIPT1 ?ROLE1 ?SCRIPT2 ?ROLE2)) (?ROLE2 ?EVENT2 ?THING))" );
			//            cyc.converseObject("(FI-ASSERT '" + assertThis.stringApiValue() + " #$SPGUMt ':DEFAULT ':FORWARD)" );
			
			//            cyc.converseObject("(FI-REASSERT '(#$implies (#$and (#$storyReferences ?EVENT1 ?SCRIPT1) (#$subEvents ?STORY ?EVENT1) (#$subEvents ?STORY ?EVENT2) (#$storyReferences ?EVENT2 ?SCRIPT2) (?ROLE1 ?EVENT1 ?THING) (#$roleFillerEquals ?SCRIPT1 ?ROLE1 ?SCRIPT2 ?ROLE2)) (?ROLE2 ?EVENT2 ?THING)) #$SPGUMt ':DEFAULT ':FORWARD)" );
			***/
		} catch (Exception e)
		{
			sendMessage(returnpath, "" + e);
		}
	}

	/***********************************************
	 *
	 * Step 3a... hypothesize not existing role fillers.
	 */
	public void hypothesizeRequiredRoleFillers(String cyclist, String returnpath, CycConstant story)
	{
		try
		{
			//            sendMessage( returnpath, "jow, ben nu hier hoa" );
			/*--------------------------------------------------------------------------
			 * Voor elk event dat subevent is van de story:
			 * 
			    (and 
			       (subEvents HYP-IndienenUrendeclaratie-9614 ?EVENT) 
			       (storyReferences ?EVENT ?SCRIPT) 
			       (requiredRolesForScript ?SCRIPT ?ROLE) 
			       (scriptRoleIsa ?SCRIPT ?ROLE ?COL))
			    ?EVENT                          ?SCRIPT                       ?ROLE           ?COL 
			    HYP-IndienenUrendeclaratie-9614 IndienenUrendeclaratie-Script verzekerde-Role Verzekerde 
			    *-------------------------------------------------------------------------*/
			CycVariable eVar = CycObjectFactory.makeCycVariable("?EVENT");
			CycVariable sVar = CycObjectFactory.makeCycVariable("?SCRIPT");
			CycVariable rVar = CycObjectFactory.makeCycVariable("?ROLE");
			CycVariable cVar = CycObjectFactory.makeCycVariable("?COL");
			ArrayList variables = new ArrayList();
			variables.add(eVar);
			variables.add(sVar);
			variables.add(rVar);
			variables.add(cVar);

			CycList query = cyc.makeCycList("(#$and (#$subEvents #$" + story.toString() + " ?EVENT) " + "(#$storyReferences ?EVENT ?SCRIPT) " + "(#$requiredRolesForScript ?SCRIPT ?ROLE) " + "(#$scriptRoleIsa (#$ScriptRoleFn ?SCRIPT ?ROLE) ?COL))");
			// ask the query (important!! must be done in scriptbotbeliefs, because #$storyReferences are also beliefs.
			//            sendMessage(returnpath, query.toString() );

			CycList results = cyc.askWithVariables(query, variables, cyc.getKnownConstantByName("ScriptBotBeliefsMt"), "1 30 nil nil");
			Iterator it = results.iterator();
			/*--------------------------------------------------------------------------
			 * For each combination
			 * event = result.first(), script = results.second(), role is third and col = fourth.
			 *-------------------------------------------------------------------------*/
			boolean anewthing = false;
			//            while( it.hasNext() && !anewthing )  {
			while (it.hasNext())
			{
				CycList result = (CycList) it.next();
				if (verbosity > 4) sendMessage(returnpath, "Checking existence for event " + ((CycConstant) result.first()).toString() + ", role " + ((CycConstant) result.third()).toString() + ", col " + ((CycConstant) result.fourth()).toString());
				/*--------------------------------------------------------------------------
				 * Check if a role filler exists.
				 *-------------------------------------------------------------------------*/
				InferenceParameters queryProperties = new DefaultInferenceParameters(cyc);
				queryProperties.setMaxTransformationDepth(2);
				if (!cyc.isQueryTrue(cyc.makeCycList("(#$thereExists ?THING (#$and " + "(#$isa ?THING " + ((CycConstant) result.fourth()).stringApiValue() + ") " + // isa thing col
						"(" + ((CycConstant) result.third()).stringApiValue() + "  " + ((CycConstant) result.first()).stringApiValue() + " ?THING) " + // role event thing
						"))"), cyc.getKnownConstantByName("ScriptBotBeliefsMt"), queryProperties, 100)) // note the backchain steps and time.
				{
					if (verbosity > 3) sendMessage(returnpath, "not found filler for event " + ((CycConstant) result.first()).toString() + ", role " + ((CycConstant) result.third()).toString() + ", col " + ((CycConstant) result.fourth()).toString());
					CycList hypThis = new CycList();
					/*--------------------------------------------------------------------------
					 * Hypothesize the thing
					 *-------------------------------------------------------------------------*/
					hypThis.add(cyc.and);
					hypThis.add(cyc.makeCycList("(#$isa ?THING " + ((CycConstant) result.fourth()).stringApiValue() + ") "));
					hypThis.add(cyc.makeCycList("(" + ((CycConstant) result.third()).stringApiValue() + "  " + ((CycConstant) result.first()).stringApiValue() + " ?THING) "));
					sendMessage(returnpath, hypThis.toString());
					CycList newrolefiller = (CycList) cyc.converseList("(fi-hypothesize '" + hypThis.stringApiValue() + " " + cyc.getKnownConstantByName("ScriptBotBeliefsMt").stringApiValue() + ")");

					if (verbosity > 1) sendMessage(returnpath, "results : " + newrolefiller.toString());
					if (newrolefiller.size() > 0)
					{
						anewthing = true;
						//                         sendMessage( returnpath, "a new thing" ); 
						/*--------------------------------------------------------------------------
						 * If there is a result, roleFillerEquals should be repropagated? yes.
						 *-------------------------------------------------------------------------*/
						repropRoles(cyclist, returnpath, story);
						sleep(10000);
					}

				} // if not exists role filler
			} // sub events with required role fillers.

		} catch (Exception e)
		{
			sendMessage(returnpath, "" + e);
		}
	}

	/***********************************************
	 *
	 * Step 4... assert beliefs of possible next acts and states in ScriptBotBeliefsMt.
	 */
	public void possibleNextActsAndStates(String cyclist, String returnpath, CycConstant story)
	{
		try
		{
			boolean newstuff = true;
			//            while( newstuff ) {
			if (newstuff)
			{
				newstuff = false;
				if (possibleNextActs(cyclist, returnpath, story) > 0) newstuff = true;
				if (possibleNextStates(cyclist, returnpath, story) > 0) newstuff = true;
			}
		} catch (Exception e)
		{
			sendMessage(returnpath, "" + e);
		}
	}

	/***********************************************
	 *
	 * assert beliefs of possible next acts in ScriptBotBeliefsMt.
	 */
	public int possibleNextActs(String cyclist, String returnpath, CycConstant story)
	{
		int newacts = 0;
		try
		{
			//            sendMessage( returnpath, "possibleNextActs called" );
			/*--------------------------------------------------------------------------
			 * For each STATE (that is subEvent of the story) and corresponding enabled ACTSCRIPT
			    (#$and 
			      (#$subSituations #$HYP-Story-9512 ?STATE) 
			      (#$isa ?STATESCRIPT #$StateScript) 
			      (#$storyReferences ?STATE ?STATESCRIPT) 
			      (#$cd-E-ScriptScript ?STATESCRIPT ?ACTSCRIPT))
			 *-------------------------------------------------------------------------*/
			CycVariable sVar = CycObjectFactory.makeCycVariable("?STATE");
			CycVariable aVar = CycObjectFactory.makeCycVariable("?ACTSCRIPT");
			ArrayList variables = new ArrayList();
			variables.add(sVar);
			variables.add(aVar);
			CycList query = cyc.makeCycList("(#$and (#$subSituations #$" + story.toString() + " ?STATE) " + "(#$isa ?STATESCRIPT #$StateScript) (#$storyReferences ?STATE ?STATESCRIPT) (#$cd-E-ScriptScript ?STATESCRIPT ?ACTSCRIPT))");
			// ask the query (important!! must be done in scriptbotbeliefs, because #$storyReferences are also beliefs.
			//            sendMessage(returnpath, query.toString() );
			CycList results = cyc.askWithVariables(query, variables, cyc.getKnownConstantByName("ScriptBotBeliefsMt"));
			Iterator it = results.iterator();
			/*--------------------------------------------------------------------------
			 * For each act and statescript combination...
			 * state = result.first()         actscript = result.second()
			 *-------------------------------------------------------------------------*/
			while (it.hasNext())
			{
				CycList result = (CycList) it.next();
				/*--------------------------------------------------------------------------
				 * is the actscript already referenced by a act in the story?
				 *-------------------------------------------------------------------------*/
				if (verbosity > 1) sendMessage(returnpath, "state and actscript " + result.first().toString() + " " + result.second().toString());
				if (!cyc.isQueryTrue(cyc.makeCycList("(#$thereExists ?SUB (#$and " + "(#$isa ?SUB #$CD-ACT) " + "(#$subEvents " + story.stringApiValue() + " ?SUB) " + "(#$storyReferences ?SUB " + ((CycConstant) result.second()).stringApiValue() + ")))"), cyc.getKnownConstantByName("ScriptBotBeliefsMt")))
				{
					/*--------------------------------------------------------------------------
					 * Get the types for this act (list of collections)
					 *-------------------------------------------------------------------------*/
					CycList actQuery = new CycList();
					CycVariable actVar = CycObjectFactory.makeCycVariable("?ACT");
					actQuery.add(cyc.getKnownConstantByName("scriptACT"));
					actQuery.add(result.second());
					actQuery.add(actVar);

					CycList hypThis = new CycList();
					hypThis.add(cyc.and);

					Iterator actTypesIt = cyc.askWithVariable(actQuery, actVar, mtForUser(cyclist)).iterator();
					while (actTypesIt.hasNext())
					{
						CycList shortList = new CycList();
						shortList.add(cyc.isa);
						shortList.add(actVar);
						shortList.add(actTypesIt.next());
						hypThis.add(shortList); // list of things like (isa ?ACT LookingForSomething) 
					}
					/*--------------------------------------------------------------------------
					 * Hypothesize the act (moet er hierna weer rolefillersequals repropagate gedaan worden? -> nee)
					 *-------------------------------------------------------------------------*/
					hypThis.add(cyc.makeCycList("(#$subEvents " + story.stringApiValue() + " ?ACT)"));
					hypThis.add(cyc.makeCycList("(#$storyReferences ?ACT #$" + result.second().toString() + ")"));
					hypThis.add(cyc.makeCycList("(#$cd-E #$" + result.first().toString() + " ?ACT)"));
					if (verbosity > 5) sendMessage(returnpath, "hyp this " + hypThis.toString());
					CycList acts = (CycList) cyc.converseList("(fi-hypothesize '" + hypThis.stringApiValue() + " " + cyc.getKnownConstantByName("ScriptBotBeliefsMt").stringApiValue() + ")");
					//                    sendMessage(returnpath,acts.toString());
					newacts += acts.size();
					/*--------------------------------------------------------------------------
					 * was the hypothesize succesful?
					 *-------------------------------------------------------------------------*/
					if (acts.size() > 0)
					{
						hypothesizeRequiredRoleFillers(cyclist, returnpath, (CycConstant) ((CycList) acts.first()).getDottedElement());
						//                        repropRoles( cyclist,returnpath, story );     
						//                        sleep( 300 );
					}
					if (verbosity >= 0) sendMessage(returnpath, "..enables (new) act " + acts.toString());

				}
				else
				{
					if (verbosity > 1) sendMessage(returnpath, "there already exists a enabled act for the state");
				}
			}

		} catch (Exception e)
		{
			sendMessage(returnpath, "" + e);
		}
		return newacts;
	}

	/***********************************************
	 *
	 * assert beliefs of possible next states in ScriptBotBeliefsMt.
	 */
	public int possibleNextStates(String cyclist, String returnpath, CycConstant story)
	{
		int newstates = 0;
		try
		{
			//            sendMessage( returnpath, "possibleNextStates called" );
			/*--------------------------------------------------------------------------
			 * For each ACT (that is subEvent of the story) and corresponding STATESCRIPT
			    (#$and 
			      (#$subEvents #$HYP-Story-9512 ?ACT) 
			      (#$isa ?SCRIPT #$AtomicActionScript) 
			      (#$storyReferences ?ACT ?ACTSCRIPT) 
			      (#$cd-r-ScriptScript ?ACTSCRIPT ?STATESCRIPT))
			 *-------------------------------------------------------------------------*/
			CycVariable aVar = CycObjectFactory.makeCycVariable("?ACT");
			CycVariable sVar = CycObjectFactory.makeCycVariable("?STATESCRIPT");
			ArrayList variables = new ArrayList();
			variables.add(aVar);
			variables.add(sVar);
			CycList query = cyc.makeCycList("(#$and (#$subEvents #$" + story.toString() + " ?ACT) " + "(#$isa ?ACTSCRIPT #$AtomicActionScript) (#$storyReferences ?ACT ?ACTSCRIPT) (#$cd-r-ScriptScript ?ACTSCRIPT ?STATESCRIPT))");
			// ask the query (important!! must be done in scriptbotbeliefs, because #$storyReferences are also beliefs.
			CycList results = cyc.askWithVariables(query, variables, cyc.getKnownConstantByName("ScriptBotBeliefsMt"));
			Iterator it = results.iterator();
			/*--------------------------------------------------------------------------
			 * For each act and statescript combination...
			 * act = result.first()         statescript = result.second()
			 *-------------------------------------------------------------------------*/
			while (it.hasNext())
			{
				CycList result = (CycList) it.next();
				/*--------------------------------------------------------------------------
				 * is the statescript already referenced by a state in the story?
				 *-------------------------------------------------------------------------*/
				if (verbosity > 1) sendMessage(returnpath, "act and statescript " + result.first().toString() + " " + result.second().toString());
				if (!cyc.isQueryTrue(cyc.makeCycList("(#$thereExists ?SUB (#$and " + "(#$isa ?SUB #$CD-STATE) " + "(#$subSituations " + story.stringApiValue() + " ?SUB) " + "(#$storyReferences ?SUB " + ((CycConstant) result.second()).stringApiValue() + ")))"), cyc.getKnownConstantByName("ScriptBotBeliefsMt")))
				{
					/*--------------------------------------------------------------------------
					 * Hypothesize the state
					 *-------------------------------------------------------------------------*/
					CycList states = (CycList) cyc.converseList("(fi-hypothesize '" + cyc.makeCycList("(#$and (#$isa ?STATE #$CD-STATE)" + "(#$subSituations " + story.stringApiValue() + " ?STATE)" + "(#$storyReferences ?STATE #$" + result.second().toString() + ")" + "(#$cd-r #$" + result.first().toString() + " ?STATE)" + ")").stringApiValue() + " " + cyc.getKnownConstantByName("ScriptBotBeliefsMt").stringApiValue() + ")");
					// was the hypothesize succesful?
					newstates += states.size();
					if (verbosity >= 0) sendMessage(returnpath, "..results in (new) state " + states.toString());
				}
				else
				{
					if (verbosity > 1) sendMessage(returnpath, "there already exists a resultant state for act");
				}
			}

		} catch (Exception e)
		{
			sendMessage(returnpath, "" + e);
		}
		return newstates;
	}

	/***********************************************
	 *
	 * Process expected thing.
	 *
	 */
	public void serviceExpectation(String cyclist, String returnpath, String token, String query)
	{
		try
		{
			CycList userStory = (CycList) userStories.get(cyclist);
			String expected = expectedFromUser(cyclist);

			// abort current story
			if (token.equals("abort"))
			{
				// done with the story, clear the userstory and expected things.
				userStories.remove(cyclist);
				expectedThings.remove(cyclist);
				userEventVariable.remove(cyclist);
				sendMessage(returnpath, "(cleared unfinished story from " + cyclist + ")");

			}
			else if (expected.equals("primitiveact"))
			{
				// check if the token is a primitive act
				CycList iqt = new CycList();
				CycConstant act = (CycConstant) cyc.getConstantByName(token);
				// 19 04 2003                iqt.add(cyc.isa);
				iqt.add(cyc.genls);
				iqt.add(act);
				// 19 04 2003 not limited to CD anymore                iqt.add(cyc.getKnownConstantByName("PrimitiveAct"));
				iqt.add(cyc.getKnownConstantByName("Event"));
				if (!cyc.isQueryTrue(iqt, mtForUser(cyclist)))
				{
					sendMessage(returnpath, "(" + token + " is not a known primitive act in " + mtForUser(cyclist).toString() + ")");
					// make (isa ?STORY CD-PTrans) and add it to the user's story.
				}
				else
				{
					// add the event to the cyclist containing the story
					CycVariable eventvar = CycObjectFactory.makeCycVariable("?EVENT" + storynumber++);
					userEventVariable.put(cyclist, eventvar);
					CycList story = new CycList();
					story.add(cyc.isa);
					story.add(eventvar);
					story.add(act);
					userStory.add(story); // add (isa ?EVENTx CD-Something) to the story.
					// add that the event is subEvent of the story.
					story = new CycList();
					story.add(cyc.getKnownConstantByName("subEvents"));
					story.add(CycObjectFactory.makeCycVariable("?STORY"));
					story.add(eventvar);
					userStory.add(story); // add (subEvents ?STORY ?EVENTx) to the story.
					// Put it into the story.
					userStories.put(cyclist, userStory);
					//                    sendMessage(returnpath, "(" + token + " is a primitive act in " + mtForUser(cyclist).toString() + ")" );
					sendMessage(returnpath, "ok, now tell me some actorslots and actors, e.g. \"performedBy Object123\" (or *me for " + cyclist + ")");
					expectedThings.put(cyclist, "actorslots");
				}
			}
			// is an actorslot expected?
			if (expected.equals("actorslots"))
			{
				// check if the token = "done"
				if (token.equals("done"))
				{
					// hypothesize the story.
					serviceShowCurrentStory(cyclist, returnpath, query);
					sendMessage(returnpath, "ok, say next for more acts, or finish if that was the whole story.");
					expectedThings.put(cyclist, "continueornot");
				}
				else
				{
					// check if the token is an actorslot
					CycList iqt = new CycList();
					CycConstant slot = (CycConstant) cyc.getConstantByName(token);
					iqt.add(cyc.isa);
					iqt.add(slot);
					//                    iqt.add(cyc.getKnownConstantByName("ActorSlot"));
					iqt.add(cyc.getKnownConstantByName("BinaryRolePredicate"));
					if (!cyc.isQueryTrue(iqt, mtForUser(cyclist)))
					{
						sendMessage(returnpath, "(" + token + " is not a known actorslot in " + mtForUser(cyclist).toString() + ")");
						// make (actorSlot ?STORY Thing) and add it to the user's story.
					}
					else if (cyc.getConstantByName(query) == null)
					{
						sendMessage(returnpath, "(" + query + " is not a known object)");
					}
					else
					{
						CycConstant actor;
						// here i have to check query for being argIsa of the actorslot (and not consisting of more than one word etc)
						CycVariable variable = (CycVariable) userEventVariable.get(cyclist);
						// *me = the chatter, else it just the mentioned constant...
						if (Strings.subWords(query, 0, 1).equals("*me"))
						{
							actor = cyc.getKnownConstantByName("#$" + cyclist + "Chatter");
						}
						else
						{
							actor = (CycConstant) cyc.getConstantByName(Strings.subWords(query, 0, 1));
						}
						CycList actorsentence = new CycList();
						actorsentence.add(slot);
						actorsentence.add(variable);
						actorsentence.add(actor);
						userStory.add(actorsentence);
						userStories.put(cyclist, userStory);
						//                    sendMessage(returnpath, "(" + token + " is a primitive act in " + mtForUser(cyclist).toString() + ")" );
						sendMessage(returnpath, "ok, tell me more actor sentences or say 'done' when finished.");
						expectedThings.put(cyclist, "actorslots");
					}
				}
			}
			// continue the story or not?
			if (expected.equals("continueornot"))
			{
				if (token.equals("finish"))
				{
					CycConstant story = null;
					if (verbosity > 1)
					{
						sendMessage(returnpath, "Trying to make sense step 1: hypothesize the story.");
					}
					else
					{
						sendMessage(returnpath, "Trying to make sense of the story.");
					}
					// hypothesize the story.
					CycList results = (CycList) cyc.converseList("(fi-hypothesize '" + toCycListString(storyFromUser(cyclist).toString()) + " " + mtForUser(cyclist).stringApiValue() + ")");
					// was the hypothesize succesful?
					sendMessage(returnpath, "results : " + results.toString());

					/*********    public Object getDottedElementForKeyword (String keyword) {
					        for (int i = 0; i < this.size() - 1; i++) {
					            if ( this.get(i).toString().startsWith("("+keyword))
					                return  this.getDottedElement();
					        }
					        return  null;
					    }
					***************/
					//                    String story = results.second().toString();
					// walk through results.. if the dottedElement is a story, it's the thing needed from the list
					for (int i = 0; i < results.size() && story == null; i++)
					{
						if (cyc.isa((CycFort) ((CycList) results.get(i)).getDottedElement(), (CycFort) cyc.getKnownConstantByName("Story")))
						{
							if (verbosity > 1) sendMessage(returnpath, "considering..");
							story = (CycConstant) ((CycList) results.second()).getDottedElement();
						}
					}
					if (story != null)
					{
						makeSenseOfStory(cyclist, returnpath, story);
					}
					else
					{
						sendMessage(returnpath, "The story doesn't make sense.");
					}
					// done with the story, clear the userstory and expected things.
					userStories.remove(cyclist);
					expectedThings.remove(cyclist);
				}
				else if (token.equals("next"))
				{
					expectedThings.put(cyclist, "primitiveact");
					sendMessage(returnpath, cyclist + " continues the story. What's the next primitive act?");
				}
			}

		} catch (Exception e)
		{
			sendMessage(returnpath, "" + e);
		}
	}

	/**
	 * Returns true if Paraphrased for a destination/returnpath
	 */
	@Override
	public boolean isParaphrased(String destination)
	{
		return (paraphrased.contains(destination));
	}

	/**
	 * Cyclifys a sentence a string
	 */
	@Override
	public CycList toCycList(String sentence)
	{
		try
		{
			return (((CycList) ((new CycListKifParser(cyc)).read(sentence))));
		} catch (Exception e)
		{
			return null;
		}
	}

	/**
	 * Cyclifys a sentence to a string
	 */
	@Override
	public String toCycListString(String sentence)
	{
		try
		{
			return (((CycList) ((new CycListKifParser(cyc)).read(sentence))).cyclify());
		} catch (Exception e)
		{
			return null;
		}
	}

	public static CycSymbol SYMBOL_NIL = new CycSymbol("NIL");

	/**
	 * Sends the Answer message from Cyc to returnpath
	 */
	@Override
	public void sendAnswers(String returnpath, Object results)
	{

		if (results instanceof CycSymbol)
		{
			if (results.equals(SYMBOL_NIL))
			{
				sendMessage(returnpath, "no answers found");
				return;
			}
		}

		if (results instanceof CycList)
		{
			CycList answers = (CycList) results;
			if (answers.size() == 1 && answers.first().equals(ScriptChat.SYMBOL_NIL))
			{
				sendMessage(returnpath, "true sentence");
				return;
			}
			if (answers.toString().length() > 120)
			{
				if (answers.size() > 50)
				{
					sendMessage(returnpath, "Your question returned " + answers.size() + " answers .. please refine. (here are the first five)");
					CycList five = new CycList();
					for (int i = 0; i < 5; i++)
						five.add(answers.get(i));
					sendAnswers(returnpath, five);
					return;
				}
				sendMessage(returnpath, answers.iterator());
				return;
			}
		}
		sendMessage(returnpath, results);
	}

	@Override
	public void sendDebug(String message)
	{
		sendMessage(ircDebug, message);
	}

	/**
	 * Sends the chat message from Cyc into the chat system.
	 */

	@Override
	public void sendChatMessage(String chatMessage)
	{
		// sendMessage(ircDestination,chatMessage);
	}

	/**
	 * Receives chat messages from the user.
	 */
	private String receiveChatMessage() throws IOException
	{
		System.out.print("user> ");
		return "foo";
	}

	public void recievedConsoleMsg(DccClientHandlerThread client, String message)
	{
		System.out.print("recievedConsoleMsg " + client + ": " + message);
	}

	@Override
	public void listenForConnections(int port)
	{
		try
		{
			//dccServer = new DccServerThread(this,port);
			//dccServer.start();
		} catch (Exception e)
		{
		}
	}

	public class DccServerThread extends Thread
	{
		public boolean listening = true;
		private ServerSocket serverSocket = null;
		private int serverPort = 4444;
		private ScriptChat ScriptChat = null;
		public HashMap clients = null;

		public DccServerThread(ScriptChat ircBot, int port) throws IOException
		{
			ScriptChat = ircBot;
			serverPort = port;
			clients = new HashMap();
			serverSocket = new ServerSocket(port);
			this.start();
		}

		@Override
		public void run()
		{
			try
			{
				while (listening)
				{
					Socket thisClient = serverSocket.accept();
					String username = getLogin(thisClient);
					DccClientHandlerThread clientThread = new DccClientHandlerThread(ScriptChat, thisClient);
					clientThread.run();
					clients.put(username, clientThread);
				}
				serverSocket.close();
			} catch (Exception e)
			{
			}
		}

		public String getLogin(Socket thisClient)
		{
			return thisClient.toString();
		}
	}

	public class DccClientHandlerThread extends Thread
	{
		private Socket socket = null;
		private ScriptChat ScriptChat = null;
		private PrintWriter out = null;
		private BufferedReader in = null;

		public DccClientHandlerThread(ScriptChat ircBot, Socket socket)
		{
			super("DccClientThread");
			this.socket = socket;
		}

		public void println(String message)
		{
			out.println(message);
		}

		@Override
		public void run()
		{
			String inputLine = null;
			try
			{
				out = new PrintWriter(socket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				while ((inputLine = in.readLine()) != null)
				{
					ScriptChat.recievedConsoleMsg(this, inputLine);
				}
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		public void disconnect()
		{
			try
			{
				out.close();
				in.close();
				socket.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
