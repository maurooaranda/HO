package core.model.match;

import core.gui.theme.HOIconName;
import core.gui.theme.ThemeManager;
import core.model.HOVerwaltung;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MatchEvent {

    private String m_sEventText = "";

    private String m_sGehilfeName = "";

    private String m_sSpielerName = "";

    private boolean m_sGehilfeHeim = true;

    private boolean m_sSpielerHeim = true;

    private int m_iGastTore;

    private int m_iGehilfeID;

    private int m_iHeimTore;

    private int m_iMatchEventCategory;

    private int m_iMatchEventID;

    public int getM_iMatchEventIndex() {
        return m_iMatchEventIndex;
    }

    public void setM_iMatchEventIndex(int m_iMatchEventIndex) {
        this.m_iMatchEventIndex = m_iMatchEventIndex;
    }

    private int m_iMatchEventIndex;

    private MatchEventID m_matchEventID;

    private int m_iMinute;

    private int m_iSpielerID;

    private int m_iTeamID;

    private int matchId;

    public enum MatchEventID
    {
        PLAYERS_ENTER_THE_FIELD(19), TACTICAL_DISPOSITION(20), PLAYER_NAMES_IN_LINEUP(21), PLAYERS_FROM_NEIGHBORHOOD_USED(22), SAME_FORMATION_BOTH_TEAMS(23), TEAM_FORMATIONS_DIFFERENT(24),
        REGIONAL_DERBY(25), NEUTRAL_GROUND(26), AWAY_IS_ACTUALLY_HOME(27), SPECTATORS_OR_VENUE_RAIN(30), SPECTATORS_OR_VENUE_CLOUDY(31), SPECTATORS_OR_VENUE_FAIR_WEATHER(32),
        SPECTATORS_OR_VENUE_SUNNY(33), ARENA_EXTENDED_WITH_TEMPORARY_SEATS(35), ONLY_VENUE_RAIN(36), ONLY_VENUE_CLOUDY(37), ONLY_VENUE_FAIR_WEATHER(38), ONLY_VENUE_SUNNY(39),
        DOMINATED(40), BEST_PLAYER(41), WORST_PLAYER(42), HALF_TIME_RESULTS(45), HATTRICK_COMMENT(46), NO_TEAM_DOMINATED(47), PENALTY_CONTEST_GOAL_BY_TECHNICAL_NO_NERVES(55),
        PENALTY_CONTEST_GOAL_NO_NERVES(56), PENALTY_CONTEST_GOAL_IN_SPITE_OF_NERVES(57), PENALTY_CONTEST_NO_GOAL_BECAUSE_OF_NERVES(58), PENALTY_CONTEST_NO_GOAL_IN_SPITE_OF_NO_NERVES(59),
        UNDERESTIMATION(60), ORGANIZATION_BREAKS(61), WITHDRAW(62), REMOVE_UNDERESTIMATION_AT_PAUSE(63), REORGANIZE(64), NERVES_IN_IMPORTANT_THRILLING_GAME(65),
        REMOVE_UNDERESTIMATION_AT_PAUSE_GOALDIFF_IS_0(66), REMOVE_UNDERESTIMATION_AT_PAUSE_GOALDIFF_IS_1(67), SUCCESSFUL_PRESSING(68), REMOVE_UNDERESTIMATION(69), EXTENSION(70),
        PENALTY_CONTEST_AFTER_EXTENSION(71), EXTENSION_DECIDED(72), AFTER_22_PENALTIES_TOSSING_COIN(73), ADDED_TIME(75), NO_ADDED_TIME(76), NEW_CAPTAIN(80),
        NEW_SET_PIECES_TAKER(81), INJURED_BUT_KEEPS_PLAYING(90), MODERATELY_INJURED_LEAVES_FIELD(91), BADLY_INJURED_LEAVES_FIELD(92), INJURED_AND_NO_REPLACEMENT_EXISTED(93),
        INJURED_AFTER_FOUL_BUT_CONTINUES(94), INJURED_AFTER_FOUL_AND_EXITS(95), INJURED_AFTER_FOUL_AND_NO_REPLACEMENT_EXISTED(96), KEEPER_INJURED_FIELD_PLAYER_HAS_TO_TAKE_HIS_PLACE(97),
        REDUCING_GOAL_HOME_TEAM_FREE_KICK(100), REDUCING_GOAL_HOME_TEAM_MIDDLE(101), REDUCING_GOAL_HOME_TEAM_LEFT_WING(102), REDUCING_GOAL_HOME_TEAM_RIGHT_WING(103),
        REDUCING_GOAL_HOME_TEAM_PENALTY_KICK_NORMAL(104), SE_GOAL_UNPREDICTABLE_LONG_PASS(105), SE_GOAL_UNPREDICTABLE_SCORES_ON_HIS_OWN(106), GOAL_LONG_SHOT_NO_TACTIC(107),
        SE_GOAL_UNPREDICTABLE_SPECIAL_ACTION(108), SE_GOAL_UNPREDICTABLE_MISTAKE(109), EQUALIZER_GOAL_HOME_TEAM_FREE_KICK(110), EQUALIZER_GOAL_HOME_TEAM_MIDDLE(111),
        EQUALIZER_GOAL_HOME_TEAM_LEFT_WING(112), EQUALIZER_GOAL_HOME_TEAM_RIGHT_WING(113), EQUALIZER_GOAL_HOME_TEAM_PENALTY_KICK_NORMAL(114), SE_QUICK_SCORES_AFTER_RUSH(115),
        SE_QUICK_RUSHES_PASSES_AND_RECEIVER_SCORES(116), SE_TIRED_DEFENDER_MISTAKE_STRIKER_SCORES(117), SE_GOAL_CORNER_TO_ANYONE(118), SE_GOAL_CORNER_HEAD_SPECIALIST(119),
        GOAL_TO_TAKE_LEAD_HOME_TEAM_FREE_KICK(120), GOAL_TO_TAKE_LEAD_HOME_TEAM_MIDDLE(121), GOAL_TO_TAKE_LEAD_HOME_TEAM_LEFT_WING(122), GOAL_TO_TAKE_LEAD_HOME_TEAM_RIGHT_WING(123),
        GOAL_TO_TAKE_LEAD_HOME_TEAM_PENALTY_KICK_NORMAL(124), SE_GOAL_UNPREDICTABLE_OWN_GOAL(125), INCREASE_GOAL_HOME_TEAM_FREE_KICK(130), INCREASE_GOAL_HOME_TEAM_MIDDLE(131),
        INCREASE_GOAL_HOME_TEAM_LEFT_WING(132), INCREASE_GOAL_HOME_TEAM_RIGHT_WING(133), INCREASE_GOAL_HOME_TEAM_PENALTY_KICK_NORMAL(134), SE_EXPERIENCED_FORWARD_SCORES(135),
        SE_INEXPERIENCED_DEFENDER_CAUSES_GOAL(136), SE_WINGER_TO_HEAD_SPEC_SCORES(137), SE_WINGER_TO_ANYONE_SCORES(138), SE_TECHNICAL_GOES_AROUND_HEAD_PLAYER(139),
        COUNTER_ATTACK_GOAL_FREE_KICK(140), COUNTER_ATTACK_GOAL_MIDDLE(141), COUNTER_ATTACK_GOAL_LEFT(142), COUNTER_ATTACK_GOAL_RIGHT(143), REDUCING_GOAL_AWAY_TEAM_FREE_KICK(150),
        REDUCING_GOAL_AWAY_TEAM_MIDDLE(151), REDUCING_GOAL_AWAY_TEAM_LEFT_WING(152), REDUCING_GOAL_AWAY_TEAM_RIGHT_WING(153), REDUCING_GOAL_AWAY_TEAM_PENALTY_KICK_NORMAL(154),
        EQUALIZER_GOAL_AWAY_TEAM_FREE_KICK(160), EQUALIZER_GOAL_AWAY_TEAM_MIDDLE(161), EQUALIZER_GOAL_AWAY_TEAM_LEFT_WING(162), EQUALIZER_GOAL_AWAY_TEAM_RIGHT_WING(163),
        EQUALIZER_GOAL_AWAY_TEAM_PENALTY_KICK_NORMAL(164), GOAL_TO_TAKE_LEAD_AWAY_TEAM_FREE_KICK(170), GOAL_TO_TAKE_LEAD_AWAY_TEAM_MIDDLE(171), GOAL_TO_TAKE_LEAD_AWAY_TEAM_LEFT_WING(172),
        GOAL_TO_TAKE_LEAD_AWAY_TEAM_RIGHT_WING(173), GOAL_TO_TAKE_LEAD_AWAY_TEAM_PENALTY_KICK_NORMAL(174), INCREASE_GOAL_AWAY_TEAM_FREE_KICK(180), INCREASE_GOAL_AWAY_TEAM_MIDDLE(181),
        INCREASE_GOAL_AWAY_TEAM_LEFT_WING(182), INCREASE_GOAL_AWAY_TEAM_RIGHT_WING(183), INCREASE_GOAL_AWAY_TEAM_PENALTY_KICK_NORMAL(184), GOAL_INDIRECT_FREE_KICK(185),
        COUNTER_ATTACK_GOAL_INDIRECT_FREE_KICK(186), GOAL_LONG_SHOT(187), SE_GOAL_POWERFUL_NORMAL_FORWARD_GENERATES_EXTRA_CHANCE(190), NO_REDUCING_GOAL_HOME_TEAM_FREE_KICK(200),
        NO_REDUCING_GOAL_HOME_TEAM_MIDDLE(201), NO_REDUCING_GOAL_HOME_TEAM_LEFT_WING(202), NO_REDUCING_GOAL_HOME_TEAM_RIGHT_WING(203), NO_REDUCING_GOAL_HOME_TEAM_PENALTY_KICK_NORMAL(204),
        SE_NO_GOAL_UNPREDICTABLE_LONG_PASS(205), SE_NO_GOAL_UNPREDICTABLE_ALMOST_SCORES(206), NO_GOAL_LONG_SHOT_NO_TACTIC(207), SE_NO_GOAL_UNPREDICTABLE_SPECIAL_ACTION(208),
        SE_NO_GOAL_UNPREDICTABLE_MISTAKE(209), NO_EQUALIZER_GOAL_HOME_TEAM_FREE_KICK(210), NO_EQUALIZER_GOAL_HOME_TEAM_MIDDLE(211), NO_EQUALIZER_GOAL_HOME_TEAM_LEFT_WING(212),
        NO_EQUALIZER_GOAL_HOME_TEAM_RIGHT_WING(213), NO_EQUALIZER_GOAL_HOME_TEAM_PENALTY_KICK_NORMAL(214), SE_SPEEDY_MISSES_AFTER_RUSH(215), SE_QUICK_RUSHES_PASSES_BUT_RECEIVER_FAILS(216),
        SE_TIRED_DEFENDER_MISTAKE_BUT_NO_GOAL(217), SE_NO_GOAL_CORNER_TO_ANYONE(218), SE_NO_GOAL_CORNER_HEAD_SPECIALIST(219), NO_GOAL_TO_TAKE_LEAD_HOME_TEAM_FREE_KICK(220),
        NO_GOAL_TO_TAKE_LEAD_HOME_TEAM_MIDDLE(221), NO_GOAL_TO_TAKE_LEAD_HOME_TEAM_LEFT_WING(222), NO_GOAL_TO_TAKE_LEAD_HOME_TEAM_RIGHT_WING(223), NO_GOAL_TO_TAKE_LEAD_HOME_TEAM_PENALTY_KICK_NORMAL(224),
        SE_NO_GOAL_UNPREDICTABLE_OWN_GOAL_ALMOST(225), NO_INCREASE_GOAL_HOME_TEAM_FREE_KICK(230), NO_INCREASE_GOAL_HOME_TEAM_MIDDLE(231), NO_INCREASE_GOAL_HOME_TEAM_LEFT_WING(232),
        NO_INCREASE_GOAL_HOME_TEAM_RIGHT_WING(233), NO_INCREASE_GOAL_HOME_TEAM_PENALTY_KICK_NORMAL(234), SE_EXPERIENCED_FORWARD_FAILS_TO_SCORE(235), SE_INEXPERIENCED_DEFENDER_ALMOST_CAUSES_GOAL(236),
        SE_WINGER_TO_SOMEONE_NO_GOAL(237), SE_TECHNICAL_GOES_AROUND_HEAD_PLAYER_NO_GOAL(239), COUNTER_ATTACK_NO_GOAL_FREE_KICK(240), COUNTER_ATTACK_NO_GOAL_MIDDLE(241), COUNTER_ATTACK_NO_GOAL_LEFT(242),
        COUNTER_ATTACK_NO_GOAL_RIGHT(243), NO_REDUCING_GOAL_AWAY_TEAM_FREE_KICK(250), NO_REDUCING_GOAL_AWAY_TEAM_MIDDLE(251), NO_REDUCING_GOAL_AWAY_TEAM_LEFT_WING(252),
        NO_REDUCING_GOAL_AWAY_TEAM_RIGHT_WING(253), NO_REDUCING_GOAL_AWAY_TEAM_PENALTY_KICK_NORMAL(254), NO_EQUALIZER_GOAL_AWAY_TEAM_FREE_KICK(260), NO_EQUALIZER_GOAL_AWAY_TEAM_MIDDLE(261),
        NO_EQUALIZER_GOAL_AWAY_TEAM_LEFT_WING(262), NO_EQUALIZER_GOAL_AWAY_TEAM_RIGHT_WING(263), NO_EQUALIZER_GOAL_AWAY_TEAM_PENALTY_KICK_NORMAL(264), NO_GOAL_TO_TAKE_LEAD_AWAY_TEAM_FREE_KICK(270),
        NO_GOAL_TO_TAKE_LEAD_AWAY_TEAM_MIDDLE(271), NO_GOAL_TO_TAKE_LEAD_AWAY_TEAM_LEFT_WING(272), NO_GOAL_TO_TAKE_LEAD_AWAY_TEAM_RIGHT_WING(273), NO_GOAL_TO_TAKE_LEAD_AWAY_TEAM_PENALTY_KICK_NORMAL(274),
        NO_INCREASE_GOAL_AWAY_TEAM_FREE_KICK(280), NO_INCREASE_GOAL_AWAY_TEAM_MIDDLE(281), NO_INCREASE_GOAL_AWAY_TEAM_LEFT_WING(282), NO_INCREASE_GOAL_AWAY_TEAM_RIGHT_WING(283),
        NO_INCREASE_GOAL_AWAY_TEAM_PENALTY_KICK_NORMAL(284), NO_GOAL_INDIRECT_FREE_KICK(285), COUNTER_ATTACK_NO_GOAL_INDIRECT_FREE_KICK(286), NO_GOAL_LONG_SHOT(287), NO_GOAL_LONG_SHOT_DEFENDED(288),
        SE_QUICK_RUSHES_STOPPED_BY_QUICK_DEFENDER(289), SE_NO_GOAL_POWERFUL_NORMAL_FORWARD_GENERATES_EXTRA_CHANCE(290), SE_TECHNICAL_SUFFERS_FROM_RAIN(301), SE_POWERFUL_THRIVES_IN_RAIN(302),
        SE_TECHNICAL_THRIVES_IN_SUN(303), SE_POWERFUL_SUFFERS_FROM_SUN(304), SE_QUICK_LOSES_IN_RAIN(305), SE_QUICK_LOSES_IN_SUN(306), SE_SUPPORT_PLAYER_BOOST_SUCCEEDED(307),
        SE_SUPPORT_PLAYER_BOOST_FAILED_AND_ORGANIZATION_DROPPED(308), SE_SUPPORT_PLAYER_BOOST_FAILED(309), SE_POWERFUL_DEFENSIVE_INNER_PRESSES_CHANCE(310), TACTIC_TYPE_PRESSING(331),
        TACTIC_TYPE_COUNTER_ATTACKING(332), TACTIC_TYPE_ATTACK_IN_MIDDLE(333), TACTIC_TYPE_ATTACK_ON_WINGS(334), TACTIC_TYPE_PLAY_CREATIVELY(335), TACTIC_TYPE_LONG_SHOTS(336),
        TACTIC_ATTACK_IN_MIDDLE_USED(343), TACTIC_ATTACK_ON_WINGS_USED(344), PLAYER_SUBSTITUTION_TEAM_IS_BEHIND(350), PLAYER_SUBSTITUTION_TEAM_IS_AHEAD(351), PLAYER_SUBSTITUTION_MINUTE(352),
        CHANGE_OF_TACTIC_TEAM_IS_BEHIND(360), CHANGE_OF_TACTIC_TEAM_IS_AHEAD(361), CHANGE_OF_TACTIC_MINUTE(362), PLAYER_POSITION_SWAP_TEAM_IS_BEHIND(370), PLAYER_POSITION_SWAP_TEAM_IS_AHEAD(371),
        PLAYER_POSITION_SWAP_MINUTE(372), MAN_MARKING_SUCCESS_SHORT_DISTANCE(380), MAN_MARKING_SUCCESS_LONG_DISTANCE(381), MAN_MARKED_CHANGED_FROM_SHORT_TO_LONG_DISTANCE(382),
        MAN_MARKED_CHANGED_FROM_LONG_TO_SHORT_DISTANCE(383), MAN_MARKER_PENALTY_NO_MAN_MARKED_ON_THE_FIELD(384), MAN_MARKER_CHANGED_FROM_SHORT_TO_LONG_DISTANCE(385), MAN_MARKER_CHANGED_FROM_LONG_TO_SHORT_DISTANCE(386),
        MAN_MARKER_PENALTY_MAN_MARKED_NOT_IN_MARKING_POSITION(387), MAN_MARKER_PENALTY_MAN_MARKER_NOT_IN_MARKING_POSITION(388), MAN_MARKER_PENALTY_NO_MAN_MARKED_IN_OPPONENT_TEAM(389), RAINY_WEATHER_MANY_PLAYERS_AFFECTED(390),
        SUNNY_WEATHER_MANY_PLAYERS_AFFECTED(391), INJURY_KNEE_LEFT(401), INJURY_KNEE_RIGHT(402), INJURY_THIGH_LEFT(403), INJURY_THIGH_RIGHT(404), INJURY_FOOT_LEFT(405), INJURY_FOOT_RIGHT(406),
        INJURY_ANKLE_LEFT(407), INJURY_ANKLE_RIGHT(408), INJURY_CALF_LEFT(409), INJURY_CALF_RIGHT(410), INJURY_GROIN_LEFT(411), INJURY_GROIN_RIGHT(412), INJURY_COLLARBONE(413), INJURY_BACK(414),
        INJURY_HAND_LEFT(415), INJURY_HAND_RIGHT(416), INJURY_ARM_LEFT(417), INJURY_ARM_RIGHT(418), INJURY_SHOULDER_LEFT(419), INJURY_SHOULDER_RIGHT(420), INJURY_RIB(421), INJURY_HEAD(422),
        INJURED_BY_FOUL(423), INJURED_PLAYER_REPLACED(424), NO_REPLACEMENT_FOR_INJURED_PLAYER(425), FIELD_PLAYER_HAS_TO_TAKE_INJURED_KEEPERS_PLACE(426), PLAYER_INJURED_WAS_REGAINER_SO_GOT_BRUISED_INSTEAD(427),
        PLAYER_GOT_THIRD_YELLOW_CARD_MISSES_NEXT_MATCH(450), WITH_THIS_STANDING_TEAM_X_WILL_RELEGATE_TO_CUP_Y(451), PLAYER_CURRENT_TEAM_MATCHES_100S_ANNIVERSARY(452), PLAYER_POSSIBLY_THE_LAST_GAME_IN_THIS_TEAM(453),
        DOCTOR_REPORT_OF_INJURY_LENGTH(454), NEW_STAR_PLAYER_OF_THE_TEAM(455), PLAYER_CAREER_GOALS_MULTIPLE_OF_50(456), PLAYER_LEAGUE_GOALS_THIS_SEASON(457), PLAYER_CUP_GOALS_THIS_SEASON(458), BENCH_PLAYER_WARMING_UP(459),
        FANS_SHOCKED_BY_LOSING(460), FANS_UPSET_BY_LOSING(461), FANS_SURPRISED_BY_WINNING(462), FANS_EXCITED_BY_WINNING(463), EXACT_NUMBER_OF_SPECTATORS(464), TEAM_SHOULD_WIN_MATCH_TO_SECURE_WINNING_THE_LEAGUE(465),
        TEAM_SHOULD_WIN_MATCH_TO_HAVE_CHANCE_OF_WINNING_LEAGUE(466), THE_WINNER_OF_THIS_MATCH_IF_THERE_IS_ONE_CAN_HAVE_A_CHANCE_OF_WINNING_THE_LEAGUE(467), TEAM_SHOULD_WIN_MATCH_TO_MAKE_SURE_THEY_DONT_DEMOTE(468),
        TEAM_SHOULD_WIN_MATCH_TO_HAVE_A_CHANCE_OF_NOT_DEMOTING(469), THE_LOSER_OF_THIS_MATCH_WILL_DEMOTE(470), HOMETEAM_OR_AWAYTEAM_HAS_MOST_POSSESSION_IN_BEGINNING_OF_MATCH(471), EQUAL_POSSESSION_IN_BEGINNING_OF_MATCH(472),
        CAREER_ENDING_INJURY(473), POSSESSION_SHIFTED(474), LOW_ATTENDANCE_BECAUSE_OF_FAN_MOOD(475), EXTRA_SECURITY_BECAUSE_OF_FAN_MOOD(476), BOTH_TEAMS_FANS_ARE_ANGRY(477), TEAM_WILL_HAVE_BEST_CUP_RUN_IF_WIN(478),
        BOTH_TEAMS_COULD_HAVE_BEST_CUP_RUN_IF_WIN_COMPETING(479), CURRENT_ROUND_IS_TEAMS_BEST_CUP_RUN(480), NEW_FORMATION_TODAY(481), TEAMS_USING_THE_SAME_STYLE_OF_PLAY(482), TEAMS_USING_DIFFERENT_STYLES_OF_PLAY(483),
        ONE_TEAMS_STYLE_OF_PLAY(484), TEAM_OF_OLDIES(485), TEAM_IS_AGGRESSIVE(486), TEAM_HAS_ONLY_HOMEGROWN_PLAYERS(487), TEAM_HAS_ALL_PLAYERS_FROM_SAME_COUNTRY(488), COMEBACK_AFTER_A_LONG_INJURY(489),
        PREVIOUS_MATCH_CUP_SIMILAR_OUTCOME(490), PREVIOUS_MATCH_CUP_DIFFERENT_OUTCOME(491), PREVIOUS_MATCH_LEAGUE_SIMILAR_OUTCOME(492), PREVIOUS_MATCH_LEAGUE_DIFFERENT_OUTCOME(493), TEAM_HAS_THE_BALL_BUT_IS_NOT_ATTACKING(494),
        TEAM_HAS_THE_BALL_AND_HAS_STARTED_ATTACKING(495), BOTH_TEAMS_WALKOVER(500), HOME_TEAM_WALKOVER(501), AWAY_TEAM_WALKOVER(502), BOTH_TEAMS_BREAK_GAME_2_PLAYERS_REMAINING(503), HOME_TEAM_BREAKS_GAME_2_PLAYERS_REMAINING(504),
        AWAY_TEAM_BREAKS_GAME_2_PLAYERS_REMAINING(505), YELLOW_CARD_NASTY_PLAY(510), YELLOW_CARD_CHEATING(511), RED_CARD_2ND_WARNING_NASTY_PLAY(512), RED_CARD_2ND_WARNING_CHEATING(513), RED_CARD_WITHOUT_WARNING(514),
        SECOND_HALF_STARTED(597), MATCH_STARTED(598), MATCH_FINISHED(599), CONGRATULATIONS_TO_THE_WINNER(601), WINNER_ADVANCES_TO_NEXT_CUP_ROUND_NO_RELEGATION_CUP_FOR_LOSER(602),
        WINNER_ADVANCES_TO_NEXT_CUP_ROUND_AND_LOSER_RELEGATES_TO_CUP_X(603), MATCH_ENDED_IN_A_TIE(604), END_OF_MATCH_CONGRATULATIONS_TEAM_WON_THE_LEAGUE(605), END_OF_MATCH_SAD_THAT_TEAM_WILL_DEMOTE_DIRECTLY(606),
        HATTRICK_ANNIVERSARY(650), TEAM_ANNIVERSARY(651), EVENTOMATIC_MANAGER_TAUNTS_OPPONENT(700), EVENTOMATIC_MANAGER_PRAISES_OPPONENT(701), EVENTOMATIC_MANAGER_ASKS_FANS_FOR_SUPPORT(702),
        EVENTOMATIC_MANAGER_EXPECTS_GREAT_SHOW(703), EVENTOMATIC_MANAGER_HONOURS_CLUB_LEGACY(704);

        private final int value;

        MatchEventID(final int newValue) {
            value = newValue;
        }

        public int getValue() { return value; }

        // Reverse-lookup map for getting a MatchEvent from its value
        private static final HashMap<Integer, MatchEventID> lookup = new HashMap<>();

        static {
            for (MatchEventID me : MatchEventID.values()) {
                lookup.put(me.getValue(), me);
            }
        }

        public static MatchEventID fromMatchEventID(int iMatchEventID) {
            return lookup.get(iMatchEventID);
        }

    }

    public Matchdetails.eInjuryType getM_eInjuryType() {
        return m_eInjuryType;
    }

    public void setM_eInjuryType(Matchdetails.eInjuryType m_eInjuryType) {
        this.m_eInjuryType = m_eInjuryType;
    }

    public void setM_eInjuryType(int i_InjuryType) {
        this.m_eInjuryType = Matchdetails.eInjuryType.fromInteger(i_InjuryType);
    }

    public Matchdetails.eInjuryType m_eInjuryType;


    public enum MatchEventCategory {
        MATCH_EVENT_GOAL(1),
        MATCH_EVENT_CARDS(5);
//        /** Information */
//        public static final int HIGHLIGHT_INFORMATION = 0;
//
//        /** Success -> Goal */
//        public static final int HIGHLIGHT_ERFOLGREICH = 1;
//
//        /** Failure -> No Goal */
//        public static final int HIGHLIGHT_FEHLGESCHLAGEN = 2;
//
//        /** Special */
//        public static final int HIGHLIGHT_SPEZIAL = 3;
//
//        /** Cards */
//        public static final int HIGHLIGHT_KARTEN = 5;

        private final int value;

        MatchEventCategory(final int newValue) {
            value = newValue;
        }

        public int getValue() { return value; }
    }

    //This is used for the mapping of Match Event and icons
    public static HashMap<MatchEventID, String> mapMatchEventIcons = new HashMap<MatchEventID, String>() {{

        put(MatchEventID.TACTICAL_DISPOSITION, HOIconName.FORMATION); //#20
        put(MatchEventID.PLAYER_NAMES_IN_LINEUP, HOIconName.FORMATION); //#21

        put(MatchEventID.PLAYERS_FROM_NEIGHBORHOOD_USED, null);    //#22
        put(MatchEventID.SAME_FORMATION_BOTH_TEAMS, null);         //#23
        put(MatchEventID.TEAM_FORMATIONS_DIFFERENT, null);         //#24
        put(MatchEventID.REGIONAL_DERBY, null);                    //#25
        put(MatchEventID.NEUTRAL_GROUND, null);                    //#26
        put(MatchEventID.AWAY_IS_ACTUALLY_HOME, null);             //#27

        put(MatchEventID.SPECTATORS_OR_VENUE_RAIN, HOIconName.WEATHER[0]); //#30
        put(MatchEventID.SPECTATORS_OR_VENUE_CLOUDY, HOIconName.WEATHER[1]); //#31
        put(MatchEventID.SPECTATORS_OR_VENUE_FAIR_WEATHER, HOIconName.WEATHER[2]); //#32
        put(MatchEventID.SPECTATORS_OR_VENUE_SUNNY, HOIconName.WEATHER[3]); //#33

        put(MatchEventID.ONLY_VENUE_RAIN, HOIconName.WEATHER[0]); //#36
        put(MatchEventID.ONLY_VENUE_CLOUDY, HOIconName.WEATHER[1]); //#37
        put(MatchEventID.ONLY_VENUE_FAIR_WEATHER, HOIconName.WEATHER[2]); //#38
        put(MatchEventID.ONLY_VENUE_SUNNY, HOIconName.WEATHER[3]); //#39

        put(MatchEventID.DOMINATED, null);              //#40
        put(MatchEventID.BEST_PLAYER, null);           //#41
        put(MatchEventID.WORST_PLAYER, null);          //#42
        put(MatchEventID.HALF_TIME_RESULTS, null);     //#45
        put(MatchEventID.HATTRICK_COMMENT, null);      //#46
        put(MatchEventID.NO_TEAM_DOMINATED, null);     //#47

        put(MatchEventID.PENALTY_CONTEST_GOAL_BY_TECHNICAL_NO_NERVES, HOIconName.ME_GOAL_AND_TECHNICAL); //#55
        put(MatchEventID.PENALTY_CONTEST_GOAL_NO_NERVES, HOIconName.GOAL); //#56
        put(MatchEventID.PENALTY_CONTEST_GOAL_IN_SPITE_OF_NERVES, HOIconName.GOAL); //#57
        put(MatchEventID.PENALTY_CONTEST_NO_GOAL_BECAUSE_OF_NERVES, HOIconName.MISS); //#58
        put(MatchEventID.PENALTY_CONTEST_NO_GOAL_IN_SPITE_OF_NO_NERVES, HOIconName.MISS); //#59

        put(MatchEventID.SUCCESSFUL_PRESSING, HOIconName.PRESSING); //#68

        put(MatchEventID.INJURED_BUT_KEEPS_PLAYING, HOIconName.BRUISED); //#90
        put(MatchEventID.MODERATELY_INJURED_LEAVES_FIELD, HOIconName.INJURED); //#91
        put(MatchEventID.BADLY_INJURED_LEAVES_FIELD, HOIconName.INJURED); //#92
        put(MatchEventID.INJURED_AND_NO_REPLACEMENT_EXISTED, HOIconName.INJURED); //#93
        put(MatchEventID.INJURED_AFTER_FOUL_BUT_CONTINUES, HOIconName.BRUISED); //#94
        put(MatchEventID.INJURED_AFTER_FOUL_AND_EXITS, HOIconName.INJURED); //#95
        put(MatchEventID.INJURED_AFTER_FOUL_AND_NO_REPLACEMENT_EXISTED, HOIconName.INJURED); //#96
        put(MatchEventID.KEEPER_INJURED_FIELD_PLAYER_HAS_TO_TAKE_HIS_PLACE, HOIconName.INJURED); //#97

        put(MatchEventID.REDUCING_GOAL_HOME_TEAM_FREE_KICK, HOIconName.GOAL_FREEKICK); //#100
        put(MatchEventID.REDUCING_GOAL_HOME_TEAM_MIDDLE, HOIconName.GOAL_MID); //#101
        put(MatchEventID.REDUCING_GOAL_HOME_TEAM_LEFT_WING, HOIconName.GOAL_LEFT); //#102
        put(MatchEventID.REDUCING_GOAL_HOME_TEAM_RIGHT_WING, HOIconName.GOAL_RIGHT); //#103
        put(MatchEventID.REDUCING_GOAL_HOME_TEAM_PENALTY_KICK_NORMAL, HOIconName.CONVERTED_PENALTY); //#104
        put(MatchEventID.SE_GOAL_UNPREDICTABLE_LONG_PASS, HOIconName.ME_GOAL_AND_UNPREDICTABLE); //#105
        put(MatchEventID.SE_GOAL_UNPREDICTABLE_SCORES_ON_HIS_OWN, HOIconName.ME_GOAL_AND_UNPREDICTABLE); //#106
        put(MatchEventID.GOAL_LONG_SHOT_NO_TACTIC, HOIconName.GOAL_LONGSHOT); //#107
        put(MatchEventID.SE_GOAL_UNPREDICTABLE_SPECIAL_ACTION, HOIconName.ME_GOAL_AND_UNPREDICTABLE); //#108
        put(MatchEventID.SE_GOAL_UNPREDICTABLE_MISTAKE, HOIconName.ME_109); //#109

        put(MatchEventID.EQUALIZER_GOAL_HOME_TEAM_FREE_KICK, HOIconName.GOAL_FREEKICK); //#110
        put(MatchEventID.EQUALIZER_GOAL_HOME_TEAM_MIDDLE, HOIconName.GOAL_MID); //#111
        put(MatchEventID.EQUALIZER_GOAL_HOME_TEAM_LEFT_WING, HOIconName.GOAL_LEFT); //#112
        put(MatchEventID.EQUALIZER_GOAL_HOME_TEAM_RIGHT_WING, HOIconName.GOAL_RIGHT); //#113
        put(MatchEventID.EQUALIZER_GOAL_HOME_TEAM_PENALTY_KICK_NORMAL, HOIconName.CONVERTED_PENALTY); //#114
        put(MatchEventID.SE_QUICK_SCORES_AFTER_RUSH, HOIconName.ME_GOAL_AND_QUICK); //#115
        put(MatchEventID.SE_QUICK_RUSHES_PASSES_AND_RECEIVER_SCORES, HOIconName.ME_GOAL_AND_QUICK); //#116
        put(MatchEventID.SE_TIRED_DEFENDER_MISTAKE_STRIKER_SCORES, HOIconName.ME_117); //#117
        put(MatchEventID.SE_GOAL_CORNER_TO_ANYONE, HOIconName.ME_118); //#118
        put(MatchEventID.SE_GOAL_CORNER_HEAD_SPECIALIST, HOIconName.ME_GOAL_AND_HEAD_SPEC); //#119

        put(MatchEventID.GOAL_TO_TAKE_LEAD_HOME_TEAM_FREE_KICK, HOIconName.GOAL_FREEKICK); //#120
        put(MatchEventID.GOAL_TO_TAKE_LEAD_HOME_TEAM_MIDDLE, HOIconName.GOAL_MID); //#121
        put(MatchEventID.GOAL_TO_TAKE_LEAD_HOME_TEAM_LEFT_WING, HOIconName.GOAL_LEFT); //#122
        put(MatchEventID.GOAL_TO_TAKE_LEAD_HOME_TEAM_RIGHT_WING, HOIconName.GOAL_RIGHT); //#123
        put(MatchEventID.GOAL_TO_TAKE_LEAD_HOME_TEAM_PENALTY_KICK_NORMAL, HOIconName.CONVERTED_PENALTY); //#124

        put(MatchEventID.INCREASE_GOAL_HOME_TEAM_FREE_KICK, HOIconName.GOAL_FREEKICK); //#130
        put(MatchEventID.INCREASE_GOAL_HOME_TEAM_MIDDLE, HOIconName.GOAL_MID); //#131
        put(MatchEventID.INCREASE_GOAL_HOME_TEAM_LEFT_WING, HOIconName.GOAL_LEFT); //#132
        put(MatchEventID.INCREASE_GOAL_HOME_TEAM_RIGHT_WING, HOIconName.GOAL_RIGHT); //#133
        put(MatchEventID.INCREASE_GOAL_HOME_TEAM_PENALTY_KICK_NORMAL, HOIconName.CONVERTED_PENALTY); //#134
        put(MatchEventID.SE_EXPERIENCED_FORWARD_SCORES, HOIconName.ME_135); //#135
        put(MatchEventID.SE_INEXPERIENCED_DEFENDER_CAUSES_GOAL, HOIconName.ME_136); //#136
        put(MatchEventID.SE_WINGER_TO_HEAD_SPEC_SCORES, HOIconName.ME_137); //#137
        put(MatchEventID.SE_WINGER_TO_ANYONE_SCORES, HOIconName.ME_138); //#138
        put(MatchEventID.SE_TECHNICAL_GOES_AROUND_HEAD_PLAYER, HOIconName.ME_139); //#139

        put(MatchEventID.COUNTER_ATTACK_GOAL_FREE_KICK, HOIconName.ME_140); //#140
        put(MatchEventID.COUNTER_ATTACK_GOAL_MIDDLE, HOIconName.ME_141); //#141
        put(MatchEventID.COUNTER_ATTACK_GOAL_LEFT, HOIconName.ME_142); //#142
        put(MatchEventID.COUNTER_ATTACK_GOAL_RIGHT, HOIconName.ME_143); //#143

        put(MatchEventID.REDUCING_GOAL_AWAY_TEAM_FREE_KICK, HOIconName.ME_GOAL_AND_WHISTLE); //#150
        put(MatchEventID.REDUCING_GOAL_AWAY_TEAM_MIDDLE, HOIconName.GOAL_MID); //#151
        put(MatchEventID.REDUCING_GOAL_AWAY_TEAM_LEFT_WING, HOIconName.GOAL_LEFT); //#152
        put(MatchEventID.REDUCING_GOAL_AWAY_TEAM_RIGHT_WING, HOIconName.GOAL_RIGHT); //#153
        put(MatchEventID.REDUCING_GOAL_AWAY_TEAM_PENALTY_KICK_NORMAL, HOIconName.CONVERTED_PENALTY); //#154

        put(MatchEventID.EQUALIZER_GOAL_AWAY_TEAM_FREE_KICK, HOIconName.GOAL_FREEKICK); //#160
        put(MatchEventID.EQUALIZER_GOAL_AWAY_TEAM_MIDDLE, HOIconName.GOAL_MID); //#161
        put(MatchEventID.EQUALIZER_GOAL_AWAY_TEAM_LEFT_WING, HOIconName.GOAL_LEFT); //#162
        put(MatchEventID.EQUALIZER_GOAL_AWAY_TEAM_RIGHT_WING, HOIconName.GOAL_RIGHT); //#163
        put(MatchEventID.EQUALIZER_GOAL_AWAY_TEAM_PENALTY_KICK_NORMAL, HOIconName.CONVERTED_PENALTY); //#164

        put(MatchEventID.GOAL_TO_TAKE_LEAD_AWAY_TEAM_FREE_KICK, HOIconName.ME_GOAL_AND_WHISTLE); //#170
        put(MatchEventID.GOAL_TO_TAKE_LEAD_AWAY_TEAM_MIDDLE, HOIconName.GOAL_MID); //#171
        put(MatchEventID.GOAL_TO_TAKE_LEAD_AWAY_TEAM_LEFT_WING, HOIconName.GOAL_LEFT); //#172
        put(MatchEventID.GOAL_TO_TAKE_LEAD_AWAY_TEAM_RIGHT_WING, HOIconName.GOAL_RIGHT); //#173
        put(MatchEventID.GOAL_TO_TAKE_LEAD_AWAY_TEAM_PENALTY_KICK_NORMAL, HOIconName.CONVERTED_PENALTY); //#174

        put(MatchEventID.INCREASE_GOAL_AWAY_TEAM_FREE_KICK, HOIconName.GOAL_FREEKICK); //#180
        put(MatchEventID.INCREASE_GOAL_AWAY_TEAM_MIDDLE, HOIconName.GOAL_MID); //#181
        put(MatchEventID.INCREASE_GOAL_AWAY_TEAM_LEFT_WING, HOIconName.GOAL_LEFT); //#182
        put(MatchEventID.INCREASE_GOAL_AWAY_TEAM_RIGHT_WING, HOIconName.GOAL_RIGHT); //#183
        put(MatchEventID.INCREASE_GOAL_AWAY_TEAM_PENALTY_KICK_NORMAL, HOIconName.ME_184); //#184
        put(MatchEventID.GOAL_INDIRECT_FREE_KICK, HOIconName.ME_185); //#185
        put(MatchEventID.COUNTER_ATTACK_GOAL_INDIRECT_FREE_KICK, HOIconName.GOAL_COUNTER); //#186
        put(MatchEventID.GOAL_LONG_SHOT, HOIconName.GOAL_LONGSHOT); //#187

        put(MatchEventID.NO_REDUCING_GOAL_HOME_TEAM_FREE_KICK, HOIconName.ME_MISS_AND_WHISTLE); //#200
        put(MatchEventID.NO_REDUCING_GOAL_HOME_TEAM_MIDDLE, HOIconName.NO_GOAL_MID); //#201
        put(MatchEventID.NO_REDUCING_GOAL_HOME_TEAM_LEFT_WING, HOIconName.NO_GOAL_LEFT); //#202
        put(MatchEventID.NO_REDUCING_GOAL_HOME_TEAM_RIGHT_WING, HOIconName.NO_GOAL_RIGHT); //#203
        put(MatchEventID.NO_REDUCING_GOAL_HOME_TEAM_PENALTY_KICK_NORMAL, HOIconName.MISSED_PENALTY); //#204
        put(MatchEventID.SE_NO_GOAL_UNPREDICTABLE_LONG_PASS, HOIconName.ME_NO_GOAL_UNPREDICTABLE); //#205
        put(MatchEventID.SE_NO_GOAL_UNPREDICTABLE_ALMOST_SCORES, HOIconName.ME_NO_GOAL_UNPREDICTABLE); //#206
        put(MatchEventID.NO_GOAL_LONG_SHOT_NO_TACTIC, HOIconName.ME_207); //#207
        put(MatchEventID.SE_NO_GOAL_UNPREDICTABLE_SPECIAL_ACTION, HOIconName.ME_NO_GOAL_UNPREDICTABLE); //#208
        put(MatchEventID.SE_NO_GOAL_UNPREDICTABLE_MISTAKE, HOIconName.ME_209); //#209

        put(MatchEventID.NO_EQUALIZER_GOAL_HOME_TEAM_FREE_KICK, HOIconName.ME_MISS_AND_WHISTLE); //#210
        put(MatchEventID.NO_EQUALIZER_GOAL_HOME_TEAM_MIDDLE, HOIconName.NO_GOAL_MID); //#211
        put(MatchEventID.NO_EQUALIZER_GOAL_HOME_TEAM_LEFT_WING, HOIconName.NO_GOAL_LEFT); //#212
        put(MatchEventID.NO_EQUALIZER_GOAL_HOME_TEAM_RIGHT_WING, HOIconName.NO_GOAL_RIGHT); //#213
        put(MatchEventID.NO_EQUALIZER_GOAL_HOME_TEAM_PENALTY_KICK_NORMAL, HOIconName.MISSED_PENALTY); //#214
        put(MatchEventID.SE_SPEEDY_MISSES_AFTER_RUSH, HOIconName.ME_ME_MISS_AND_QUICK); //#215
        put(MatchEventID.SE_QUICK_RUSHES_PASSES_BUT_RECEIVER_FAILS, HOIconName.ME_ME_MISS_AND_QUICK); //#216
        put(MatchEventID.SE_TIRED_DEFENDER_MISTAKE_BUT_NO_GOAL, HOIconName.ME_217); //#217
        put(MatchEventID.SE_NO_GOAL_CORNER_TO_ANYONE, HOIconName.ME_MISSED_CORNER); //#218
        put(MatchEventID.SE_NO_GOAL_CORNER_HEAD_SPECIALIST, HOIconName.ME_NO_GOAL_AND_HEAD_SPEC); //#219

        put(MatchEventID.NO_GOAL_TO_TAKE_LEAD_HOME_TEAM_FREE_KICK, HOIconName.ME_MISS_AND_WHISTLE); //#220
        put(MatchEventID.NO_GOAL_TO_TAKE_LEAD_HOME_TEAM_MIDDLE, HOIconName.NO_GOAL_MID); //#221
        put(MatchEventID.NO_GOAL_TO_TAKE_LEAD_HOME_TEAM_LEFT_WING, HOIconName.NO_GOAL_LEFT); //#222
        put(MatchEventID.NO_GOAL_TO_TAKE_LEAD_HOME_TEAM_RIGHT_WING, HOIconName.NO_GOAL_RIGHT); //#223
        put(MatchEventID.NO_GOAL_TO_TAKE_LEAD_HOME_TEAM_PENALTY_KICK_NORMAL, HOIconName.MISSED_PENALTY); //#224

        put(MatchEventID.NO_INCREASE_GOAL_HOME_TEAM_FREE_KICK, HOIconName.ME_MISS_AND_WHISTLE); //#230
        put(MatchEventID.NO_INCREASE_GOAL_HOME_TEAM_MIDDLE, HOIconName.NO_GOAL_MID); //#231
        put(MatchEventID.NO_INCREASE_GOAL_HOME_TEAM_LEFT_WING, HOIconName.NO_GOAL_LEFT); //#232
        put(MatchEventID.NO_INCREASE_GOAL_HOME_TEAM_RIGHT_WING, HOIconName.NO_GOAL_RIGHT); //#233
        put(MatchEventID.NO_INCREASE_GOAL_HOME_TEAM_PENALTY_KICK_NORMAL, HOIconName.MISSED_PENALTY); //#234
        put(MatchEventID.SE_EXPERIENCED_FORWARD_FAILS_TO_SCORE, HOIconName.ME_235); //#235
        put(MatchEventID.SE_INEXPERIENCED_DEFENDER_ALMOST_CAUSES_GOAL, HOIconName.ME_236); //#236
        put(MatchEventID.SE_WINGER_TO_SOMEONE_NO_GOAL, HOIconName.ME_237); //#237
        put(MatchEventID.SE_TECHNICAL_GOES_AROUND_HEAD_PLAYER_NO_GOAL, HOIconName.ME_239); //#239

        put(MatchEventID.COUNTER_ATTACK_NO_GOAL_FREE_KICK, HOIconName.ME_240); //#240
        put(MatchEventID.COUNTER_ATTACK_NO_GOAL_MIDDLE, HOIconName.ME_241); //#241
        put(MatchEventID.COUNTER_ATTACK_NO_GOAL_LEFT, HOIconName.ME_242); //#242
        put(MatchEventID.COUNTER_ATTACK_NO_GOAL_RIGHT, HOIconName.ME_243); //#243

        put(MatchEventID.NO_REDUCING_GOAL_AWAY_TEAM_FREE_KICK, HOIconName.ME_MISS_AND_WHISTLE); //#250
        put(MatchEventID.NO_REDUCING_GOAL_AWAY_TEAM_MIDDLE, HOIconName.NO_GOAL_MID); //#251
        put(MatchEventID.NO_REDUCING_GOAL_AWAY_TEAM_LEFT_WING, HOIconName.NO_GOAL_LEFT); //#252
        put(MatchEventID.NO_REDUCING_GOAL_AWAY_TEAM_RIGHT_WING, HOIconName.NO_GOAL_RIGHT); //#253
        put(MatchEventID.NO_REDUCING_GOAL_AWAY_TEAM_PENALTY_KICK_NORMAL, HOIconName.MISSED_PENALTY); //#254

        put(MatchEventID.NO_EQUALIZER_GOAL_AWAY_TEAM_FREE_KICK, HOIconName.ME_MISS_AND_WHISTLE); //#260
        put(MatchEventID.NO_EQUALIZER_GOAL_AWAY_TEAM_MIDDLE, HOIconName.NO_GOAL_MID); //#261
        put(MatchEventID.NO_EQUALIZER_GOAL_AWAY_TEAM_LEFT_WING, HOIconName.NO_GOAL_LEFT); //#262
        put(MatchEventID.NO_EQUALIZER_GOAL_AWAY_TEAM_RIGHT_WING, HOIconName.NO_GOAL_RIGHT); //#263
        put(MatchEventID.NO_EQUALIZER_GOAL_AWAY_TEAM_PENALTY_KICK_NORMAL, HOIconName.MISSED_PENALTY); //#264

        put(MatchEventID.NO_GOAL_TO_TAKE_LEAD_AWAY_TEAM_FREE_KICK, HOIconName.ME_MISS_AND_WHISTLE); //#270
        put(MatchEventID.NO_GOAL_TO_TAKE_LEAD_AWAY_TEAM_MIDDLE, HOIconName.NO_GOAL_MID); //#271
        put(MatchEventID.NO_GOAL_TO_TAKE_LEAD_AWAY_TEAM_LEFT_WING, HOIconName.NO_GOAL_LEFT); //#272
        put(MatchEventID.NO_GOAL_TO_TAKE_LEAD_AWAY_TEAM_RIGHT_WING, HOIconName.NO_GOAL_RIGHT); //#273
        put(MatchEventID.NO_GOAL_TO_TAKE_LEAD_AWAY_TEAM_PENALTY_KICK_NORMAL, HOIconName.MISSED_PENALTY); //#274

        put(MatchEventID.NO_INCREASE_GOAL_AWAY_TEAM_FREE_KICK, HOIconName.ME_MISS_AND_WHISTLE); //#280
        put(MatchEventID.NO_INCREASE_GOAL_AWAY_TEAM_MIDDLE, HOIconName.NO_GOAL_MID); //#281
        put(MatchEventID.NO_INCREASE_GOAL_AWAY_TEAM_LEFT_WING, HOIconName.NO_GOAL_LEFT); //#282
        put(MatchEventID.NO_INCREASE_GOAL_AWAY_TEAM_RIGHT_WING, HOIconName.NO_GOAL_RIGHT); //#283
        put(MatchEventID.NO_INCREASE_GOAL_AWAY_TEAM_PENALTY_KICK_NORMAL, HOIconName.MISSED_PENALTY); //#284
        put(MatchEventID.NO_GOAL_INDIRECT_FREE_KICK, HOIconName.ME_285); //#285
        put(MatchEventID.COUNTER_ATTACK_NO_GOAL_INDIRECT_FREE_KICK, HOIconName.ME_286); //#286
        put(MatchEventID.NO_GOAL_LONG_SHOT, HOIconName.NO_GOAL_LONGSHOT); //#287

        put(MatchEventID.SE_TECHNICAL_SUFFERS_FROM_RAIN, HOIconName.WEATHER_RAIN_NEG); //#301
        put(MatchEventID.SE_POWERFUL_THRIVES_IN_RAIN, HOIconName.WEATHER_RAIN_POS); //#302
        put(MatchEventID.SE_TECHNICAL_THRIVES_IN_SUN, HOIconName.WEATHER_SUN_POS); //#303
        put(MatchEventID.SE_POWERFUL_SUFFERS_FROM_SUN, HOIconName.WEATHER_SUN_NEG); //#304
        put(MatchEventID.SE_QUICK_LOSES_IN_RAIN, HOIconName.WEATHER_RAIN_NEG); //#305
        put(MatchEventID.SE_QUICK_LOSES_IN_SUN, HOIconName.WEATHER_SUN_NEG); //#306

        put(MatchEventID.TACTIC_TYPE_PRESSING, HOIconName.PRESSING); //#331

        put(MatchEventID.PLAYER_SUBSTITUTION_TEAM_IS_BEHIND, HOIconName.REPLACEMENT); //#350
        put(MatchEventID.PLAYER_SUBSTITUTION_TEAM_IS_AHEAD , HOIconName.REPLACEMENT); //#351
        put(MatchEventID.PLAYER_SUBSTITUTION_MINUTE, HOIconName.REPLACEMENT); //#352

        put(MatchEventID.CHANGE_OF_TACTIC_TEAM_IS_BEHIND, HOIconName.ROTATE); //#360
        put(MatchEventID.CHANGE_OF_TACTIC_TEAM_IS_AHEAD, HOIconName.ROTATE); //#361
        put(MatchEventID.CHANGE_OF_TACTIC_MINUTE, HOIconName.ROTATE); //#362

        put(MatchEventID.INJURED_PLAYER_REPLACED, HOIconName.REPLACEMENT); //#424

        put(MatchEventID.YELLOW_CARD_NASTY_PLAY, HOIconName.YELLOWCARD); //#510
        put(MatchEventID.YELLOW_CARD_CHEATING, HOIconName.YELLOWCARD); //#511
        put(MatchEventID.RED_CARD_2ND_WARNING_NASTY_PLAY, HOIconName.ME_YELLOW_THEN_RED); //#512
        put(MatchEventID.RED_CARD_2ND_WARNING_CHEATING, HOIconName.ME_YELLOW_THEN_RED); //#513
        put(MatchEventID.RED_CARD_WITHOUT_WARNING, HOIconName.REDCARD); //#514
    }};


    /**
     * Creates a new instance of MatchHighlight
     */
    public MatchEvent() {
    }

    //~ Methods ------------------------------------------------------------------------------------

    public boolean isBruisedOrInjured()
    {
        return ( isBruised() || isInjured());
    }

    public boolean isBruised()
    {
        return m_eInjuryType == Matchdetails.eInjuryType.BRUISE;
    }

    public boolean isInjured()
    {
        return m_eInjuryType == Matchdetails.eInjuryType.INJURY;
    }

    public boolean isBooked()
    {
        return ( isYelloCard() || isRedCard());
    }

    public boolean isPenaltyContestGoalEvent() {
        return ( (this.m_matchEventID == MatchEventID.PENALTY_CONTEST_GOAL_BY_TECHNICAL_NO_NERVES) || (this.m_matchEventID == MatchEventID.PENALTY_CONTEST_GOAL_NO_NERVES) ||
                (this.m_matchEventID == MatchEventID.PENALTY_CONTEST_GOAL_IN_SPITE_OF_NERVES) );
    }

    public boolean isPenaltyContestNoGoalEvent() {
        return ( (this.m_matchEventID == MatchEventID.PENALTY_CONTEST_NO_GOAL_BECAUSE_OF_NERVES) || (this.m_matchEventID == MatchEventID.PENALTY_CONTEST_NO_GOAL_IN_SPITE_OF_NO_NERVES));
    }

    public boolean isChangeOfTactic() {
        return ( (this.m_matchEventID == MatchEventID.CHANGE_OF_TACTIC_TEAM_IS_BEHIND) ||(this.m_matchEventID == MatchEventID.CHANGE_OF_TACTIC_TEAM_IS_AHEAD) || (this.m_matchEventID == MatchEventID.CHANGE_OF_TACTIC_MINUTE));
    }

    public boolean isGoalEvent() { return isGoalEvent(m_iMatchEventID); }

    public static boolean isGoalEvent(int iMatchEventID) {return ( (iMatchEventID>=100) && (iMatchEventID<200) );}

    public boolean isNonGoalEvent()
    {
        return ( (this.m_iMatchEventID>=200) && (this.m_iMatchEventID<300) );
    }

    public boolean isSubstitution()
    {
        return ( (this.m_matchEventID == MatchEventID.PLAYER_SUBSTITUTION_TEAM_IS_BEHIND) || (this.m_matchEventID == MatchEventID.PLAYER_SUBSTITUTION_TEAM_IS_AHEAD) ||
                (this.m_matchEventID == MatchEventID.PLAYER_SUBSTITUTION_MINUTE) || (this.m_matchEventID == MatchEventID.INJURED_PLAYER_REPLACED) );
    }

    /**
     * Setter for property m_sEventText.
     *
     * @param m_sEventText New value of property m_sEventText.
     */
    public final void setEventText(String m_sEventText) {
        this.m_sEventText = m_sEventText;
    }

    public final int getMatchId() {
		return matchId;
	}

	public final void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	/**
     * Getter for property m_sEventText.
     *
     * @return Value of property m_sEventText.
     */
    public final String getEventText() {
        return m_sEventText;
    }

    /**
     * Setter for property m_iGastTore.
     *
     * @param m_iGastTore New value of property m_iGastTore.
     */
    public final void setGastTore(int m_iGastTore) {
        this.m_iGastTore = m_iGastTore;
    }

    /**
     * Getter for property m_iGastTore.
     *
     * @return Value of property m_iGastTore.
     */
    public final int getGastTore() {
        return m_iGastTore;
    }

    /**
     * Setter for property m_sGehilfeHeim.
     *
     * @param m_sGehilfeHeim New value of property m_sGehilfeHeim.
     */
    public final void setGehilfeHeim(boolean m_sGehilfeHeim) {
        this.m_sGehilfeHeim = m_sGehilfeHeim;
    }

    /**
     * Getter for property m_sGehilfeHeim.
     *
     * @return Value of property m_sGehilfeHeim.
     */
    public final boolean getGehilfeHeim() {
        return m_sGehilfeHeim;
    }

    /**
     * Setter for property m_iGehilfeID.
     *
     * @param m_iGehilfeID New value of property m_iGehilfeID.
     */
    public final void setGehilfeID(int m_iGehilfeID) {
        this.m_iGehilfeID = m_iGehilfeID;
    }

    /**
     * Getter for property m_iGehilfeID.
     *
     * @return Value of property m_iGehilfeID.
     */
    public final int getGehilfeID() {
        return m_iGehilfeID;
    }

    /**
     * Setter for property m_sGehilfeName.
     *
     * @param m_sGehilfeName New value of property m_sGehilfeName.
     */
    public final void setGehilfeName(String m_sGehilfeName) {
        this.m_sGehilfeName = m_sGehilfeName;
    }

    /**
     * Getter for property m_sGehilfeName.
     *
     * @return Value of property m_sGehilfeName.
     */
    public final String getGehilfeName() {
        return m_sGehilfeName;
    }


    /**
     * Getter for property m_iHeimTore.
     *
     * @return Value of property m_iHeimTore.
     */
    public final int getHeimTore() {
        return m_iHeimTore;
    }


    public final void setMatchEventID(int m_iMatchEventID) {
        this.m_iMatchEventID = m_iMatchEventID;
        this.m_matchEventID = MatchEventID.fromMatchEventID(m_iMatchEventID);
    }

    public final int getiMatchEventID() {
        return m_iMatchEventID;
    }

    public final MatchEventID getMatchEventID() {
        return this.m_matchEventID;
    }

    public final void setMatchEventCategory(int m_iMatchEventCategory) {this.m_iMatchEventCategory = m_iMatchEventCategory;}

    public final int getMatchEventCategory() {return m_iMatchEventCategory;}

    /**
     * Setter for property m_iMinute.
     *
     * @param m_iMinute New value of property m_iMinute.
     */
    public final void setMinute(int m_iMinute) {
        this.m_iMinute = m_iMinute;
    }

    /**
     * Getter for property m_iMinute.
     *
     * @return Value of property m_iMinute.
     */
    public final int getMinute() {
        return m_iMinute;
    }

    /**
     * Setter for property m_sSpielerHeim.
     *
     * @param m_sSpielerHeim New value of property m_sSpielerHeim.
     */
    public final void setSpielerHeim(boolean m_sSpielerHeim) {
        this.m_sSpielerHeim = m_sSpielerHeim;
    }

    /**
     * Getter for property m_sSpielerHeim.
     *
     * @return Value of property m_sSpielerHeim.
     */
    public final boolean getSpielerHeim() {
        return m_sSpielerHeim;
    }

    /**
     * Setter for property m_iSpielerID.
     *
     * @param m_iSpielerID New value of property m_iSpielerID.
     */
    public final void setSpielerID(int m_iSpielerID) {
        this.m_iSpielerID = m_iSpielerID;
    }

    /**
     * Getter for property m_iSpielerID.
     *
     * @return Value of property m_iSpielerID.
     */
    public final int getSpielerID() {
        return m_iSpielerID;
    }

    /**
     * Setter for property m_sSpielerName.
     *
     * @param m_sSpielerName New value of property m_sSpielerName.
     */
    public final void setSpielerName(String m_sSpielerName) {
        this.m_sSpielerName = m_sSpielerName;
    }

    /**
     * Getter for property m_sSpielerName.
     *
     * @return Value of property m_sSpielerName.
     */
    public final String getSpielerName() {
        return m_sSpielerName;
    }

    /**
     * Setter for property m_iTeamID.
     *
     * @param m_iTeamID New value of property m_iTeamID.
     */
    public final void setTeamID(int m_iTeamID) {
        this.m_iTeamID = m_iTeamID;
    }

    /**
     * Getter for property m_iTeamID.
     *
     * @return Value of property m_iTeamID.
     */
    public final int getTeamID() {
        return m_iTeamID;
    }


    public boolean isYelloCard() {return yellowCardME.contains(this.m_matchEventID) ; }

    public static List<MatchEventID> yellowCardME = Arrays.asList(
            MatchEventID.YELLOW_CARD_NASTY_PLAY,                // #510
            MatchEventID.YELLOW_CARD_CHEATING)  ;              // #511

    public boolean isRedCard() {return redCardME.contains(this.m_matchEventID) ; }

    public static List<MatchEventID> redCardME = Arrays.asList(
            MatchEventID.RED_CARD_2ND_WARNING_NASTY_PLAY,          // #512
            MatchEventID.RED_CARD_2ND_WARNING_CHEATING,            // #513
            MatchEventID.RED_CARD_WITHOUT_WARNING)  ;              // #514



    public boolean isSpecialEvent() {return specialME.contains(this.m_matchEventID) ; }

    public static List<MatchEventID> specialME = Arrays.asList(
            MatchEventID.SE_GOAL_UNPREDICTABLE_LONG_PASS,                                         // #105
            MatchEventID.SE_GOAL_UNPREDICTABLE_SCORES_ON_HIS_OWN,                                 // #106
            MatchEventID.SE_GOAL_UNPREDICTABLE_SPECIAL_ACTION,                                    // #108
            MatchEventID.SE_GOAL_UNPREDICTABLE_MISTAKE,                                           // #109
            MatchEventID.SE_QUICK_SCORES_AFTER_RUSH,                                              // #115
            MatchEventID.SE_QUICK_RUSHES_PASSES_AND_RECEIVER_SCORES,                              // #116
            MatchEventID.SE_TIRED_DEFENDER_MISTAKE_STRIKER_SCORES,                                // #117
            MatchEventID.SE_GOAL_CORNER_TO_ANYONE,                                                // #118
            MatchEventID.SE_GOAL_CORNER_HEAD_SPECIALIST,                                          // #119
            MatchEventID.SE_GOAL_UNPREDICTABLE_OWN_GOAL,                                          // #125
            MatchEventID.SE_EXPERIENCED_FORWARD_SCORES,                                           // #135
            MatchEventID.SE_INEXPERIENCED_DEFENDER_CAUSES_GOAL,                                   // #136
            MatchEventID.SE_WINGER_TO_HEAD_SPEC_SCORES,                                           // #137
            MatchEventID.SE_WINGER_TO_ANYONE_SCORES,                                              // #138
            MatchEventID.SE_TECHNICAL_GOES_AROUND_HEAD_PLAYER,                                    // #139
            MatchEventID.SE_GOAL_POWERFUL_NORMAL_FORWARD_GENERATES_EXTRA_CHANCE,                  // #190
            MatchEventID.SE_NO_GOAL_UNPREDICTABLE_LONG_PASS,                                      // #205
            MatchEventID.SE_NO_GOAL_UNPREDICTABLE_ALMOST_SCORES,                                  // #206
            MatchEventID.SE_NO_GOAL_UNPREDICTABLE_SPECIAL_ACTION,                                 // #208
            MatchEventID.SE_NO_GOAL_UNPREDICTABLE_MISTAKE,                                        // #209
            MatchEventID.SE_SPEEDY_MISSES_AFTER_RUSH,                                             // #215
            MatchEventID.SE_QUICK_RUSHES_PASSES_BUT_RECEIVER_FAILS,                               // #216
            MatchEventID.SE_TIRED_DEFENDER_MISTAKE_BUT_NO_GOAL,                                   // #217
            MatchEventID.SE_NO_GOAL_CORNER_TO_ANYONE,                                             // #218
            MatchEventID.SE_NO_GOAL_CORNER_HEAD_SPECIALIST,                                       // #219
            MatchEventID.SE_NO_GOAL_UNPREDICTABLE_OWN_GOAL_ALMOST,                                // #225
            MatchEventID.SE_EXPERIENCED_FORWARD_FAILS_TO_SCORE,                                   // #235
            MatchEventID.SE_INEXPERIENCED_DEFENDER_ALMOST_CAUSES_GOAL,                            // #236
            MatchEventID.SE_WINGER_TO_SOMEONE_NO_GOAL,                                            // #237
            MatchEventID.SE_TECHNICAL_GOES_AROUND_HEAD_PLAYER_NO_GOAL,                            // #239
            MatchEventID.SE_QUICK_RUSHES_STOPPED_BY_QUICK_DEFENDER,                               // #289
            MatchEventID.SE_NO_GOAL_POWERFUL_NORMAL_FORWARD_GENERATES_EXTRA_CHANCE)  ;            // #290

    public boolean isIFK() {return IFKME.contains(this.m_matchEventID) ; }

    public static List<MatchEventID> IFKME = Arrays.asList(
            MatchEventID.GOAL_INDIRECT_FREE_KICK,                // #185
            MatchEventID.NO_GOAL_INDIRECT_FREE_KICK)  ;          // #285



    public boolean isLS() {return LSME.contains(this.m_matchEventID) ; }

    public static List<MatchEventID> LSME = Arrays.asList(
            MatchEventID.GOAL_LONG_SHOT_NO_TACTIC,                // #107
            MatchEventID.GOAL_LONG_SHOT,                          // #187
            MatchEventID.NO_GOAL_LONG_SHOT_NO_TACTIC,            // #207
            MatchEventID.NO_GOAL_LONG_SHOT_NO_TACTIC) ;          // #287)

    /**
     * Check, if it is a Counter Attack event
     */
    public boolean isCounterAttack() {return CounterAttackME.contains(this.m_matchEventID) ; }

    public static List<MatchEventID> CounterAttackME = Arrays.asList(
            MatchEventID.COUNTER_ATTACK_GOAL_FREE_KICK,                 // #140
            MatchEventID.COUNTER_ATTACK_GOAL_MIDDLE,                    // #141
            MatchEventID.COUNTER_ATTACK_GOAL_LEFT,                      // #142
            MatchEventID.COUNTER_ATTACK_GOAL_RIGHT,                     // #143
            MatchEventID.COUNTER_ATTACK_GOAL_INDIRECT_FREE_KICK,        // #186
            MatchEventID.COUNTER_ATTACK_NO_GOAL_FREE_KICK,              // #240
            MatchEventID.COUNTER_ATTACK_NO_GOAL_MIDDLE,                 // #241
            MatchEventID.COUNTER_ATTACK_NO_GOAL_LEFT,                   // #242
            MatchEventID.COUNTER_ATTACK_NO_GOAL_RIGHT,                  // #243
            MatchEventID.COUNTER_ATTACK_NO_GOAL_INDIRECT_FREE_KICK);    // #286

            /**
             * Check, if it is an attack on Right wing
             */
    public boolean isCentralAttack() {return CentralAttackME.contains(this.m_matchEventID) ; }

    public static List<MatchEventID> CentralAttackME = Arrays.asList(
            MatchEventID.REDUCING_GOAL_HOME_TEAM_MIDDLE,                // #101
            MatchEventID.EQUALIZER_GOAL_HOME_TEAM_MIDDLE,               // #111
            MatchEventID.GOAL_TO_TAKE_LEAD_HOME_TEAM_MIDDLE,            // #121
            MatchEventID.INCREASE_GOAL_HOME_TEAM_MIDDLE,                // #131
            MatchEventID.REDUCING_GOAL_AWAY_TEAM_MIDDLE,                // #151
            MatchEventID.EQUALIZER_GOAL_AWAY_TEAM_MIDDLE,               // #161
            MatchEventID.GOAL_TO_TAKE_LEAD_AWAY_TEAM_MIDDLE,            // #171
            MatchEventID.INCREASE_GOAL_AWAY_TEAM_MIDDLE,                // #181
            MatchEventID.NO_REDUCING_GOAL_HOME_TEAM_MIDDLE,             // #201
            MatchEventID.NO_EQUALIZER_GOAL_HOME_TEAM_MIDDLE,            // #211
            MatchEventID.NO_GOAL_TO_TAKE_LEAD_HOME_TEAM_MIDDLE,         // #221
            MatchEventID.NO_INCREASE_GOAL_HOME_TEAM_MIDDLE,             // #231
            MatchEventID.NO_REDUCING_GOAL_AWAY_TEAM_MIDDLE,             // #251
            MatchEventID.NO_EQUALIZER_GOAL_AWAY_TEAM_MIDDLE,            // #261
            MatchEventID.NO_GOAL_TO_TAKE_LEAD_AWAY_TEAM_MIDDLE,         // #271
            MatchEventID.NO_INCREASE_GOAL_AWAY_TEAM_MIDDLE) ;           // #281)

    /**
     * Check, if it is an attack on Right wing
     */
    public boolean isRightAttack() {return RightAttackME.contains(this.m_matchEventID) ; }

    public static List<MatchEventID> RightAttackME = Arrays.asList(
            MatchEventID.REDUCING_GOAL_HOME_TEAM_RIGHT_WING,                // #103
            MatchEventID.EQUALIZER_GOAL_HOME_TEAM_RIGHT_WING,               // #113
            MatchEventID.GOAL_TO_TAKE_LEAD_HOME_TEAM_RIGHT_WING,            // #123
            MatchEventID.INCREASE_GOAL_HOME_TEAM_RIGHT_WING,                // #133
            MatchEventID.REDUCING_GOAL_AWAY_TEAM_RIGHT_WING,                // #153
            MatchEventID.EQUALIZER_GOAL_AWAY_TEAM_RIGHT_WING,               // #163
            MatchEventID.GOAL_TO_TAKE_LEAD_AWAY_TEAM_RIGHT_WING,            // #173
            MatchEventID.INCREASE_GOAL_AWAY_TEAM_RIGHT_WING,                // #183
            MatchEventID.NO_REDUCING_GOAL_HOME_TEAM_RIGHT_WING,             // #203
            MatchEventID.NO_EQUALIZER_GOAL_HOME_TEAM_RIGHT_WING,            // #213
            MatchEventID.NO_GOAL_TO_TAKE_LEAD_HOME_TEAM_RIGHT_WING,         // #223
            MatchEventID.NO_INCREASE_GOAL_HOME_TEAM_RIGHT_WING,             // #233
            MatchEventID.NO_REDUCING_GOAL_AWAY_TEAM_RIGHT_WING,             // #253
            MatchEventID.NO_EQUALIZER_GOAL_AWAY_TEAM_RIGHT_WING,            // #263
            MatchEventID.NO_GOAL_TO_TAKE_LEAD_AWAY_TEAM_RIGHT_WING,         // #273
            MatchEventID.NO_INCREASE_GOAL_AWAY_TEAM_RIGHT_WING) ;           // #283)


    /**
     * Check, if it is an attack on left wing
     */
    public boolean isLeftAttack() {return leftAttackME.contains(this.m_matchEventID) ; }

    public static List<MatchEventID> leftAttackME = Arrays.asList(
            MatchEventID.REDUCING_GOAL_HOME_TEAM_LEFT_WING,                // #102
            MatchEventID.EQUALIZER_GOAL_HOME_TEAM_LEFT_WING,               // #112
            MatchEventID.GOAL_TO_TAKE_LEAD_HOME_TEAM_LEFT_WING,            // #122
            MatchEventID.INCREASE_GOAL_HOME_TEAM_LEFT_WING,                // #132
            MatchEventID.REDUCING_GOAL_AWAY_TEAM_LEFT_WING,                // #152
            MatchEventID.EQUALIZER_GOAL_AWAY_TEAM_LEFT_WING,               // #162
            MatchEventID.GOAL_TO_TAKE_LEAD_AWAY_TEAM_LEFT_WING,            // #172
            MatchEventID.INCREASE_GOAL_AWAY_TEAM_LEFT_WING,                // #182
            MatchEventID.NO_REDUCING_GOAL_HOME_TEAM_LEFT_WING,             // #202
            MatchEventID.NO_EQUALIZER_GOAL_HOME_TEAM_LEFT_WING,            // #212
            MatchEventID.NO_GOAL_TO_TAKE_LEAD_HOME_TEAM_LEFT_WING,         // #222
            MatchEventID.NO_INCREASE_GOAL_HOME_TEAM_LEFT_WING,             // #232
            MatchEventID.NO_REDUCING_GOAL_AWAY_TEAM_LEFT_WING,             // #252
            MatchEventID.NO_EQUALIZER_GOAL_AWAY_TEAM_LEFT_WING,            // #262
            MatchEventID.NO_GOAL_TO_TAKE_LEAD_AWAY_TEAM_LEFT_WING,         // #272
            MatchEventID.NO_INCREASE_GOAL_AWAY_TEAM_LEFT_WING) ;           // #282)

    /**
     * Check, if it is a free kick event
     */
    public boolean isFreeKick() {return freekickME.contains(this.m_matchEventID) ; }

    public static List<MatchEventID> freekickME = Arrays.asList(
            MatchEventID.REDUCING_GOAL_HOME_TEAM_FREE_KICK,                // #100
            MatchEventID.EQUALIZER_GOAL_HOME_TEAM_FREE_KICK,               // #110
            MatchEventID.GOAL_TO_TAKE_LEAD_HOME_TEAM_FREE_KICK,            // #120
            MatchEventID.INCREASE_GOAL_HOME_TEAM_FREE_KICK,                // #130
            MatchEventID.REDUCING_GOAL_AWAY_TEAM_FREE_KICK,                // #150
            MatchEventID.EQUALIZER_GOAL_AWAY_TEAM_FREE_KICK,               // #160
            MatchEventID.GOAL_TO_TAKE_LEAD_AWAY_TEAM_FREE_KICK,            // #170
            MatchEventID.INCREASE_GOAL_AWAY_TEAM_FREE_KICK,                // #180
            MatchEventID.NO_REDUCING_GOAL_HOME_TEAM_FREE_KICK,             // #200
            MatchEventID.NO_EQUALIZER_GOAL_HOME_TEAM_FREE_KICK,            // #210
            MatchEventID.NO_GOAL_TO_TAKE_LEAD_HOME_TEAM_FREE_KICK,         // #220
            MatchEventID.NO_INCREASE_GOAL_HOME_TEAM_FREE_KICK,             // #230
            MatchEventID.NO_REDUCING_GOAL_AWAY_TEAM_FREE_KICK,             // #250
            MatchEventID.NO_EQUALIZER_GOAL_AWAY_TEAM_FREE_KICK,            // #260
            MatchEventID.NO_GOAL_TO_TAKE_LEAD_AWAY_TEAM_FREE_KICK,         // #270
            MatchEventID.NO_INCREASE_GOAL_AWAY_TEAM_FREE_KICK) ;           // #280)

    /**
     * Check, if it is a penalty event
     */
    public boolean isPenalty() {return penaltyME.contains(this.m_matchEventID) ; }

    public static List<MatchEventID> penaltyME = Arrays.asList(
                                    MatchEventID.REDUCING_GOAL_HOME_TEAM_PENALTY_KICK_NORMAL,                // #104
                                    MatchEventID.EQUALIZER_GOAL_HOME_TEAM_PENALTY_KICK_NORMAL,               // #114
                                    MatchEventID.GOAL_TO_TAKE_LEAD_HOME_TEAM_PENALTY_KICK_NORMAL,            // #124
                                    MatchEventID.INCREASE_GOAL_HOME_TEAM_PENALTY_KICK_NORMAL,                // #134
                                    MatchEventID.REDUCING_GOAL_AWAY_TEAM_PENALTY_KICK_NORMAL,                // #154
                                    MatchEventID.EQUALIZER_GOAL_AWAY_TEAM_PENALTY_KICK_NORMAL,               // #164
                                    MatchEventID.GOAL_TO_TAKE_LEAD_AWAY_TEAM_PENALTY_KICK_NORMAL,            // #174
                                    MatchEventID.INCREASE_GOAL_AWAY_TEAM_PENALTY_KICK_NORMAL,                // #184
                                    MatchEventID.NO_REDUCING_GOAL_HOME_TEAM_PENALTY_KICK_NORMAL,             // #204
                                    MatchEventID.NO_EQUALIZER_GOAL_HOME_TEAM_PENALTY_KICK_NORMAL,            // #214
                                    MatchEventID.NO_GOAL_TO_TAKE_LEAD_HOME_TEAM_PENALTY_KICK_NORMAL,         // #224
                                    MatchEventID.NO_INCREASE_GOAL_HOME_TEAM_PENALTY_KICK_NORMAL,             // #234
                                    MatchEventID.NO_REDUCING_GOAL_AWAY_TEAM_PENALTY_KICK_NORMAL,             // #254
                                    MatchEventID.NO_EQUALIZER_GOAL_AWAY_TEAM_PENALTY_KICK_NORMAL,            // #264
                                    MatchEventID.NO_GOAL_TO_TAKE_LEAD_AWAY_TEAM_PENALTY_KICK_NORMAL,         // #274
                                    MatchEventID.NO_INCREASE_GOAL_AWAY_TEAM_PENALTY_KICK_NORMAL) ;           // #284)

    /**
     * Check, if it is a long shot event
     */
    public boolean isLongShot() {
        return
                (this.m_matchEventID ==  MatchEventID.GOAL_LONG_SHOT_NO_TACTIC ||     // #107
                this.m_matchEventID == MatchEventID.GOAL_LONG_SHOT ||                 // #187
                this.m_matchEventID == MatchEventID.NO_GOAL_LONG_SHOT_NO_TACTIC ||    // #207
                this.m_matchEventID == MatchEventID.NO_GOAL_LONG_SHOT ||              // #287
                this.m_matchEventID == MatchEventID.NO_GOAL_LONG_SHOT_DEFENDED) ;     // #288
    }



    /**
     * Check, if it is a Special Event
     */
    public boolean isSE() {
        return this.m_matchEventID.name().startsWith("SE_");
    }


    /**
     * Check, if it is a SE not related to specialty (SetPieces, stamina and XP)
     */
    public boolean isOtherSE() {
        return
                (this.m_matchEventID ==  MatchEventID.SE_TIRED_DEFENDER_MISTAKE_STRIKER_SCORES ||
                this.m_matchEventID == MatchEventID.SE_TIRED_DEFENDER_MISTAKE_BUT_NO_GOAL ||
                this.m_matchEventID == MatchEventID.SE_GOAL_CORNER_TO_ANYONE ||
                this.m_matchEventID == MatchEventID.SE_NO_GOAL_CORNER_TO_ANYONE ||
                this.m_matchEventID == MatchEventID.SE_EXPERIENCED_FORWARD_SCORES ||
                this.m_matchEventID == MatchEventID.SE_EXPERIENCED_FORWARD_FAILS_TO_SCORE ||
                this.m_matchEventID == MatchEventID.SE_INEXPERIENCED_DEFENDER_CAUSES_GOAL ||
                this.m_matchEventID == MatchEventID.SE_INEXPERIENCED_DEFENDER_ALMOST_CAUSES_GOAL);
    }


    /**
     * Check, if it is a Specialty Special Event, i.e SE but not weather
     */
    public boolean isSpecialtyNonWeatherSE() {
        return (this.isSE() && (!this.isSpecialtyWeatherSE()) );
    }


    /**
     * Check, if it is a SE related both to player specialty and weather
     */
    public boolean isSpecialtyWeatherSE() {
    	return
    			(this.m_matchEventID ==  MatchEventID.SE_TECHNICAL_SUFFERS_FROM_RAIN ||
                this.m_matchEventID == MatchEventID.SE_POWERFUL_THRIVES_IN_RAIN ||
                this.m_matchEventID == MatchEventID.SE_TECHNICAL_THRIVES_IN_SUN ||
                this.m_matchEventID == MatchEventID.SE_POWERFUL_SUFFERS_FROM_SUN ||
                this.m_matchEventID == MatchEventID.SE_QUICK_LOSES_IN_RAIN ||
                this.m_matchEventID == MatchEventID.SE_QUICK_LOSES_IN_SUN);
    }

    /**
     * Check, if it is a positive SE related both to player specialty and weather
     */
    public boolean isPositiveSpecialtyWeatherSE() {
        return
                (m_iMatchEventID ==  MatchEventID.SE_TECHNICAL_THRIVES_IN_SUN.value ||
                 m_iMatchEventID == MatchEventID.SE_POWERFUL_THRIVES_IN_RAIN.value);
    }

    /**
     * Check, if it is a negative SE related both to player specialty and weather
     */
    public boolean isNegativeSpecialtyWeatherSE() {
        return (this.isSpecialtyWeatherSE() && (! this.isPositiveSpecialtyWeatherSE()));
    }

    public String getEventTextDescription() {
        return getEventTextDescription(m_matchEventID.value);
        }

    public static String getEventTextDescription(int iMatchEventID) {
        return HOVerwaltung.instance().getLanguageString("MatchEvent_"+iMatchEventID);
    }

    public ImageIcon getIcon() {

        MatchEventID me = this.getMatchEventID();

        if (me == null) { return null;}


        ImageIcon icon;

        if (isBruised()) {
            icon = ThemeManager.getIcon(HOIconName.BRUISED);}
        else if (isInjured()) {
            icon = ThemeManager.getIcon(HOIconName.INJURED);}
        else {
            icon = ThemeManager.getIcon(MatchEvent.mapMatchEventIcons.getOrDefault(me, HOIconName.UNKOWN));}
        return icon;

    }


    }