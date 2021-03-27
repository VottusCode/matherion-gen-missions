yarn run v1.22.4
$ tsnd src/index.ts
[INFO] 16:40:58 ts-node-dev ver. 1.0.0 (using ts-node ver. 9.0.0, typescript ver. 4.0.2)

ItemBuilder hi_owner = new ItemBuilder(Material.REDSTONE_BLOCK, 1)
  .setDisplayNameName("§6§lHi Owner! §8§o(ID 47)")
  .addLore("§fPozdrav v chatu majitele pomocí označení..")
  .addLore("")
  .addLore("§7Obtížnost: §aLehká")
  .addLore("")
  .getQuestStatus(nickname, "hi_owner")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder hidden_or_lost = new ItemBuilder(Material.LILY_OF_THE_VALLEY, 1)
  .setDisplayNameName("§6§lHidden, or lost? §8§o(ID 48)")
  .addLore("§fNajdi na spawnu ztracenou lilii..")
  .addLore("")
  .addLore("§7Obtížnost: §aLehká")
  .addLore("")
  .getQuestStatus(nickname, "hidden_or_lost")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder meet_the_developers = new ItemBuilder(Material.GOLD_BLOCK, 1)
  .setDisplayNameName("§6§lMeet the Developers §8§o(ID 49)")
  .addLore("§fPotkej na serveru všechny vývojáře..")
  .addLore("")
  .addLore("§7Obtížnost: §eStřední")
  .addLore("")
  .getQuestStatus(nickname, "meet_the_developers")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder tagger = new ItemBuilder(Material.STICK, 1)
  .setDisplayNameName("§6§lTagger §8§o(ID 50)")
  .addLore("§fOznač minimálně 5 lidí v chatu..")
  .addLore("")
  .addLore("§7Obtížnost: §aLehká")
  .addLore("")
  .getQuestStatus(nickname, "tagger")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder shard_master = new ItemBuilder(Material.PRISMARINE_SHARD, 1)
  .setDisplayNameName("§6§lShard Master §8§o(ID 51)")
  .addLore("§fOtevři 10 LuckyShardů..")
  .addLore("")
  .addLore("§7Obtížnost: §cTěžká")
  .addLore("")
  .getQuestStatus(nickname, "shard_master")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder aliens = new ItemBuilder(Material.EYE_OF_ENDER, 1)
  .setDisplayNameName("§6§lALIENS! §8§o(ID 52)")
  .addLore("§fNajdi na spawnu návštěvníka z vesmíru..")
  .addLore("")
  .addLore("§7Obtížnost: §eStřední")
  .addLore("")
  .getQuestStatus(nickname, "aliens")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder competetive_soul = new ItemBuilder(Material.EMERALD_BLOCK, 1)
  .setDisplayNameName("§6§lCompetetive Soul! §8§o(ID 53)")
  .addLore("§fVyhraj 10 eventů..")
  .addLore("")
  .addLore("§7Obtížnost: §cTěžká")
  .addLore("")
  .getQuestStatus(nickname, "competetive_soul")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder witcher = new ItemBuilder(Material.POTION, 1)
  .setDisplayNameName("§6§lWitcher §8§o(ID 54)")
  .addLore("§fPřines čarodejnici na spawn lektvar..")
  .addLore("")
  .addLore("§7Obtížnost: §eStřední")
  .addLore("")
  .getQuestStatus(nickname, "witcher")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder touch_the_heaven = new ItemBuilder(Material.ELYTRA, 1)
  .setDisplayNameName("§6§lTouch the Heaven §8§o(ID 55)")
  .addLore("§fDostaň se do výšky 256 blocků..")
  .addLore("")
  .addLore("§7Obtížnost: §aLehká")
  .addLore("")
  .getQuestStatus(nickname, "touch_the_heaven")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder almost_for_the_first_time = new ItemBuilder(Material.PRISMARINE_SHARD, 1)
  .setDisplayNameName("§6§lAlmost For the First Time §8§o(ID 57)")
  .addLore("§fVycrafti svůj vlastní LuckyShard..")
  .addLore("")
  .addLore("§7Obtížnost: §eStřední")
  .addLore("")
  .getQuestStatus(nickname, "almost_for_the_first_time")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder save_the_trees = new ItemBuilder(Material.OAK_SAPLING, 1)
  .setDisplayNameName("§6§lSave the Trees §8§o(ID 58)")
  .addLore("§fZasaď 100 dubových sazenic..")
  .addLore("")
  .addLore("§7Obtížnost: §eStřední")
  .addLore("")
  .getQuestStatus(nickname, "save_the_trees")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder who_needs_anvil_anyway = new ItemBuilder(Material.ANVIL, 1)
  .setDisplayNameName("§6§lWho Needs Anvil Anyway §8§o(ID 59)")
  .addLore("§fOprav si své nástroje u <DOPLŇ>..")
  .addLore("")
  .addLore("§7Obtížnost: §aLehká")
  .addLore("")
  .getQuestStatus(nickname, "who_needs_anvil_anyway")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder no_lifer = new ItemBuilder(Material.RED_BED, 1)
  .setDisplayNameName("§6§l#NoLifer §8§o(ID 60)")
  .addLore("§fOdehraj na serveru za 1 den 12 hodin..")
  .addLore("")
  .addLore("§7Obtížnost: §cTěžká")
  .addLore("")
  .getQuestStatus(nickname, "no_lifer")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder gamer = new ItemBuilder(Material.CYAN_BED, 1)
  .setDisplayNameName("§6§lGamer! §8§o(ID 61)")
  .addLore("§fOdehraj 1 den čistého času na serveru..")
  .addLore("")
  .addLore("§7Obtížnost: §eStřední")
  .addLore("")
  .getQuestStatus(nickname, "gamer")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder alchemist = new ItemBuilder(Material.POTION, 1)
  .setDisplayNameName("§6§lAlchemist §8§o(ID 62)")
  .addLore("§fUmíchej 10 lektvarů..")
  .addLore("")
  .addLore("§7Obtížnost: §eStřední")
  .addLore("")
  .getQuestStatus(nickname, "alchemist")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder piglins_trader = new ItemBuilder(Material.GOLD_INGOT, 1)
  .setDisplayNameName("§6§lPiglins trader §8§o(ID 63)")
  .addLore("§fObchoduj s pigliny se zlatem..")
  .addLore("")
  .addLore("§7Obtížnost: §aLehká")
  .addLore("")
  .getQuestStatus(nickname, "piglins_trader")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder kocour_mart_nek = new ItemBuilder(Material.THEMOUZ, 1)
  .setDisplayNameName("§6§lKocour Martínek §8§o(ID 64)")
  .addLore("§fNasaď si hlavu majitele TheMouz..")
  .addLore("")
  .addLore("§7Obtížnost: §aLehká")
  .addLore("")
  .getQuestStatus(nickname, "kocour_mart_nek")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder popeye_the_sailor = new ItemBuilder(Material.OAK_BOAT, 1)
  .setDisplayNameName("§6§lPopeye the Sailor §8§o(ID 65)")
  .addLore("§fUjeď v loďce 1000 blocků..")
  .addLore("")
  .addLore("§7Obtížnost: §eStřední")
  .addLore("")
  .getQuestStatus(nickname, "popeye_the_sailor")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder ikaros = new ItemBuilder(Material.ELYTRA, 1)
  .setDisplayNameName("§6§lIkaros §8§o(ID 66)")
  .addLore("§fUleť s elytrou 10000 blocků..")
  .addLore("")
  .addLore("§7Obtížnost: §eStřední")
  .addLore("")
  .getQuestStatus(nickname, "ikaros")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder i_am_a_doge = new ItemBuilder(Material.BONE, 1)
  .setDisplayNameName("§6§lI am a Doge §8§o(ID 67)")
  .addLore("§fDej si do tlamy kost..")
  .addLore("")
  .addLore("§7Obtížnost: §eStřední")
  .addLore("")
  .getQuestStatus(nickname, "i_am_a_doge")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder village_s_traitor = new ItemBuilder(Material.IRON_BLOCK, 1)
  .setDisplayNameName("§6§lVillage´s Traitor §8§o(ID 68)")
  .addLore("§fStaň se zdrádcem vesnice a zabij Iron Golema..")
  .addLore("")
  .addLore("§7Obtížnost: §eStřední")
  .addLore("")
  .getQuestStatus(nickname, "village_s_traitor")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder hero_of_the_village = new ItemBuilder(Material.EMERALD, 1)
  .setDisplayNameName("§6§lHero of the Village §8§o(ID 69)")
  .addLore("§fPorad Raid a zachraň vesnici..")
  .addLore("")
  .addLore("§7Obtížnost: §eStřední")
  .addLore("")
  .getQuestStatus(nickname, "hero_of_the_village")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder hero_of_the_villagers = new ItemBuilder(Material.HEAL_POTION, 1)
  .setDisplayNameName("§6§lHero of the Villagers §8§o(ID 70)")
  .addLore("§fVyléči zombie villagera..")
  .addLore("")
  .addLore("§7Obtížnost: §aNení možné splnit")
  .addLore("")
  .getQuestStatus(nickname, "hero_of_the_villagers")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder aquaman = new ItemBuilder(Material.HEART_OF_THE_SEA, 1)
  .setDisplayNameName("§6§lAquaman §8§o(ID 71)")
  .addLore("§fPostav podvodní Beacon..")
  .addLore("")
  .addLore("§7Obtížnost: §cTěžká")
  .addLore("")
  .getQuestStatus(nickname, "aquaman")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder key_chain = new ItemBuilder(Material.TRIPWIRE_HOOK, 1)
  .setDisplayNameName("§6§lKeyChain §8§o(ID 72)")
  .addLore("§fProtoč jeden Klíč od MagicBoxu..")
  .addLore("")
  .addLore("§7Obtížnost: §eStřední")
  .addLore("")
  .getQuestStatus(nickname, "key_chain")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder post_morten = new ItemBuilder(Material.TOTEM_OF_UNDYING, 1)
  .setDisplayNameName("§6§lPost-Morten §8§o(ID 73)")
  .addLore("§fVyužij Totem Štěstí..")
  .addLore("")
  .addLore("§7Obtížnost: §cTěžká")
  .addLore("")
  .getQuestStatus(nickname, "post_morten")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder ultra_miner = new ItemBuilder(Material.GOLD_PICKAXE, 1)
  .setDisplayNameName("§6§lUltra Miner! §8§o(ID 74)")
  .addLore("§fVytěž 5000 blocků v MineWorldu..")
  .addLore("")
  .addLore("§7Obtížnost: §eStřední")
  .addLore("")
  .getQuestStatus(nickname, "ultra_miner")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder heavy_fighter = new ItemBuilder(Material.NETHERITE_CHESTPLATE, 1)
  .setDisplayNameName("§6§lHeavy Fighter §8§o(ID 75)")
  .addLore("§fNasaď si kompletní netherite brnění..")
  .addLore("")
  .addLore("§7Obtížnost: §cTěžká")
  .addLore("")
  .getQuestStatus(nickname, "heavy_fighter")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder human_killer = new ItemBuilder(Material.IRON_SWORD, 1)
  .setDisplayNameName("§6§lHuman Killer §8§o(ID 76)")
  .addLore("§fZabij 5 hráčů..")
  .addLore("")
  .addLore("§7Obtížnost: §eStřední")
  .addLore("")
  .getQuestStatus(nickname, "human_killer")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder vote_master = new ItemBuilder(Material.TRIPWIRE_HOOK, 1)
  .setDisplayNameName("§6§lVoteMaster §8§o(ID 77)")
  .addLore("§fVyhraj ve VoteParty..")
  .addLore("")
  .addLore("§7Obtížnost: §cTěžká")
  .addLore("")
  .getQuestStatus(nickname, "vote_master")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder bitcoin_trader = new ItemBuilder(Material.GOLD_INGOT, 1)
  .setDisplayNameName("§6§lBitcoin Trader §8§o(ID 78)")
  .addLore("§fMěj na účtě 50 kreditů..")
  .addLore("")
  .addLore("§7Obtížnost: §cTěžká")
  .addLore("")
  .getQuestStatus(nickname, "bitcoin_trader")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder trader = new ItemBuilder(Material.GOLD_INGOT, 1)
  .setDisplayNameName("§6§lTrader §8§o(ID 79)")
  .addLore("§fMěj na účtě 100 kreditů a  100.000$..")
  .addLore("")
  .addLore("§7Obtížnost: §4Extrémní")
  .addLore("")
  .getQuestStatus(nickname, "trader")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder drowned = new ItemBuilder(Material.WATER_BUCKET, 1)
  .setDisplayNameName("§6§lDrowned §8§o(ID 80)")
  .addLore("§fZemři na utopení..")
  .addLore("")
  .addLore("§7Obtížnost: §eStřední")
  .addLore("")
  .getQuestStatus(nickname, "drowned")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder dragon_s_breath = new ItemBuilder(Material.DRAGON_BREATH, 1)
  .setDisplayNameName("§6§lDragon´s breath §8§o(ID 81)")
  .addLore("§fNaber si dračí dech do sklenice..")
  .addLore("")
  .addLore("§7Obtížnost: §eStřední")
  .addLore("")
  .getQuestStatus(nickname, "dragon_s_breath")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder marathon = new ItemBuilder(Material.LEATHER_BOOTS, 1)
  .setDisplayNameName("§6§lMarathon §8§o(ID 82)")
  .addLore("§fUjdi 42.195 blocků..")
  .addLore("")
  .addLore("§7Obtížnost: §cTěžká")
  .addLore("")
  .getQuestStatus(nickname, "marathon")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder god_powers = new ItemBuilder(Material.ENCHANTED_GOLDEN_APPLE, 1)
  .setDisplayNameName("§6§lGod Powers §8§o(ID 83)")
  .addLore("§fSněz kus ráje enchantovaného zlatého jablka..")
  .addLore("")
  .addLore("§7Obtížnost: §cTěžká")
  .addLore("")
  .getQuestStatus(nickname, "god_powers")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder high_flight = new ItemBuilder(Material.SHULKERBOX, 1)
  .setDisplayNameName("§6§lHigh Flight §8§o(ID 85)")
  .addLore("§fVzleť do oblak pomocí Shulkera..")
  .addLore("")
  .addLore("§7Obtížnost: §aLehká")
  .addLore("")
  .getQuestStatus(nickname, "high_flight")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder thorns = new ItemBuilder(Material.CACTUS, 1)
  .setDisplayNameName("§6§lThorns §8§o(ID 86)")
  .addLore("§fNech se zabít kaktusem..")
  .addLore("")
  .addLore("§7Obtížnost: §aLehká")
  .addLore("")
  .getQuestStatus(nickname, "thorns")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder bob_the_builder = new ItemBuilder(Material.IRON_PICKAXE, 1)
  .setDisplayNameName("§6§lBob the Builder §8§o(ID 87)")
  .addLore("§fPolož 10.000 blocků..")
  .addLore("")
  .addLore("§7Obtížnost: §cTěžká")
  .addLore("")
  .getQuestStatus(nickname, "bob_the_builder")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder strong_miner = new ItemBuilder(Material.OBSIDIAN, 1)
  .setDisplayNameName("§6§lStrong Miner §8§o(ID 88)")
  .addLore("§fVykopej obsidián dřevěným krumpáčem..")
  .addLore("")
  .addLore("§7Obtížnost: §cTěžká")
  .addLore("")
  .getQuestStatus(nickname, "strong_miner")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder gambler = new ItemBuilder(Material.TRIPWIRE_HOOK, 1)
  .setDisplayNameName("§6§lGambler §8§o(ID 89)")
  .addLore("§fProtoč 5 Klíčů od MagicBoxu..")
  .addLore("")
  .addLore("§7Obtížnost: §4Extrémní")
  .addLore("")
  .getQuestStatus(nickname, "gambler")
  .addLore("")
  .addLore("§7Odměna za splnění:");

ItemBuilder svarta_jump = new ItemBuilder(Material.GOLDEN_BOOTS, 1)
  .setDisplayNameName("§6§lSvarta Jump §8§o(ID 90)")
  .addLore("§fSkoč ze 150 blocků..")
  .addLore("")
  .addLore("§7Obtížnost: §eStřední")
  .addLore("")
  .getQuestStatus(nickname, "svarta_jump")
  .addLore("")
  .addLore("§7Odměna za splnění:");
Done in 1.16s.
