package main.com.yourantao.aimeili.util.codpreprocessing;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

import main.com.yourantao.aimeili.bean.UserAddress;

public class No5COD extends BaseCOD {
	private static final String COD_STR = "!北京市：(1) (含所辖各区县)"
			+ "!天津市：(1) (含所辖各区县)"
			+ "!上海市：(1) (含所辖各区县)"
			+ "!重庆市：(1) 渝中区、沙坪坝区、渝北区、南岸区、巴南区、北碚区、九龙坡区、大渡口、万盛区、双桥区、江北区、长寿、巴县、綦江、合川、永川、江津、大足、荣昌、铜梁、潼南、璧山、梁平、垫江"
			+ "!河北省：(141) 石家庄、井陉矿区、鹿泉市、井陉县、行唐、新乐、正定县、元氏、栾城、赵县、藁城、晋州市、辛集市、无极县、邯郸、峰峰、武安市、涉县、磁县、临漳县、成安县、魏县、大名县、永年县、曲周县、鸡泽县、邱县、肥乡县、广平县、馆陶县、邢台、沙河市、内邱县、临城县、南和县、平乡县、广宗县、威县、清河县、临西县、任县、巨鹿县、隆尧县、柏乡县、宁晋县、新河县、南宫市、保定、清苑县、安国市、博野县、蠡县、高阳县、安新县、容城县、雄县、满城县、顺平县、唐县、望都县、徐水县、定兴县、涿州市、定州市、曲阳县、阜平县、涞水县、高碑店市、易县、涞源县、张家口、宣化、下花园、怀来县、涿鹿县、蔚县、阳原县、怀安县、万全县、崇礼县、沧县、张北县、承德市、兴隆县、承德县、平泉县、宽城县、隆化县、滦平县、丰宁县、围场县、唐山、唐海县、丰南市、滦南县、乐亭县、滦县、丰润县、玉田县、遵化市、迁西县、迁安县、秦皇岛、抚宁县、卢龙县、青龙县、昌黎县、沧州市、黄骅市、海兴县、盐山县、孟村县、南皮县、东光县、吴桥县、泊头市、献县、肃宁县、河间市、任丘市、青县、廊坊、三河、大厂、香河、固安、永清、霸州市、文安、大城县、衡水、枣强县、冀州市、武强县、武邑县、景县、安平县、阜城县、深州市、饶阳县、故城。"
			+ "!山西省：(91) 太原市、阳曲、古交市、娄烦、清徐、交城、晋中市、太谷、祁县、平遥、灵石、霍州市、汾西、介休、文水、汾阳、孝义市、忻州、原平市、代县、繁峙、灵丘、静乐、定襄、五台、大同市、左云、大同县、浑源、广灵、应县、阳高、天镇、怀仁、朔州、五寨、宁武、平鲁区、山阴、离石、柳林、临汾、蒲县、隰县、永和、襄汾、洪洞、乡宁、吉县、大宁、古县、安泽、浮山、侯马、新绛、稷山、河津市、曲沃、翼城、绛县、垣曲、闻喜、运城、临猗、万荣、平陆、夏县、永济市、芮城、阳泉、盂县、平定、昔阳、寿阳、长治市、屯留、襄垣、武乡、沁县、沁源、长子、长治县、壶关、平顺、潞城市、黎城、晋城、阳城、沁水、陵川、高平市。"
			+ "!内蒙古自治区：(82) 呼和浩特市、包头、赤峰、乌海、通辽、鄂尔多斯（东胜）、海拉尔、乌兰浩特、锡林浩特、集宁、临河、阿拉善左旗（阿左旗）、二连浩特、满州里、牙克石、扎兰屯市、额尔古纳、根河、阿尔山、霍林郭勒、丰镇市。土默特左旗、托克托、薛家湾、准格尔旗、苏尼特右旗、苏尼特左旗、和林格尔县、清水河县、武川县、四子王旗、察哈尔右翼前旗、卓资县、察哈尔右翼后旗、镶黄旗、化德县、商都县、察哈尔右翼中旗、兴和县、凉城、正镶白旗、太仆寺旗、正兰旗、多伦县、土默特右旗、固阳县、达拉特旗、乌拉特前旗、达尔罕茂明安联合旗、五原县、磴口县、乌拉特中旗、杭锦后旗、乌拉特后旗、鄂托克旗、鄂托克前旗、伊金霍洛旗、乌审旗、杭锦旗、鄂温克旗（伊敏）、新巴尔虎左旗、新巴尔虎右旗、陈巴尔虎旗、宁城县、敖汉旗、喀喇沁旗、翁牛特旗、巴林右旗、林西县、克什克腾旗、巴林左旗、阿鲁科尔沁旗、西乌旗、东乌旗、阿巴嘎旗、科尔沁左翼后旗、库伦旗、奈曼旗、开鲁县、扎鲁特旗、科尔沁左翼中旗、科尔沁右翼中旗。"
			+ "!辽宁省：(58) 沈阳市、大连市、鞍山市、抚顺市、本溪市、丹东市、锦州市、营口市、盘锦市、阜新市、辽阳市、铁岭市、葫芦岛（锦西）市、朝阳市、辽中、新民、法库、康平、辽阳县、灯塔、抚顺县、新宾、清原、本溪县、桓仁、盘山、大洼、普兰店、瓦房店、庄河、义县、凌海、北宁、黑山、兴城、苏家屯、绥中、建昌、开原、西丰、昌图、铁岭县、铁法、台安、海城、岫岩、大石桥、盖州、凤城、宽甸、东港、北票、喀左、建平、凌源、朝阳县、阜新县、彰武。"
			+ "!吉林省：(46) 长春市、吉林市、四平市、辽源市、通化市、白山市、松原市、白城市、延吉市、农安、德惠、榆树、九台、双阳、伊通、乾安、长岭、公主岭、永吉、磐石、桦甸、蛟河、舒兰、洮南、通榆、镇赉、图们、汪清、珲春、龙井、和龙、安图、敦化、通化县、集安、长白、抚松、临江、靖宇、柳河、东丰、双辽、梨树、梅河口、辉南、大安。"
			+ "!黑龙江省：(37) 哈尔滨市、齐齐哈尔、鹤岗市、双鸭山市、鸡西市、大庆市、伊春市、牡丹江市、佳木斯市、七台河市、黑河市、五常、宾县、呼兰、尚志、方正、肇东、依兰、龙江、讷河、克山、萝北、富锦、建三江、绥棱、海伦、宝清、海林、东宁、绥芬河、绥化、鸡东、密山、虎林、五大连池市、加格达奇。"
			+ "!江苏省：(71) 南京、江宁、溧水、高淳、仪征、六合、金湖、盱眙、江浦、胥浦、徐州、睢宁、邳州、新沂、沛县、丰县、沭阳、泗阳、宿迁、泗洪、常州、金坛、溧阳、镇江、扬中、丹阳、句容、兴化、武进、无锡、宜兴、江阴、靖江、苏州、吴江、昆山、太仓、常熟、张家港、连云港、赣榆、灌云、东海、灌南、淮阴市、洪泽、淮安、淮阴县、涟水、盐城、大丰、东台、射阳、阜宁、滨海、响水、建湖、扬州、江都、泰州、泰兴、姜堰、高邮、宝应、南通、海门、启东、通州、如东、如皋、海安。"
			+ "!浙江省：(72) 杭州、余杭、萧山、临安、富阳、桐庐、建德、淳安、诸暨、宁波、镇海、慈溪、余姚、奉化、宁海、象山、北仑、舟山、普陀、温州、永嘉、瑞安、平阳、乐清、苍南、金华、兰溪、武义、永康、缙云、义乌、东阳、浦江、绍兴、上虞、嵊州、新昌、湖州、长兴、德清、嘉兴、嘉善、平湖、海盐、海宁、桐乡、台州、临海、天台、仙居、温岭、玉环、丽水、云和、龙泉、青田、衢州、江山、常山、开化、龙游、庆元、景宁、松阳、遂昌、三门、磐安、安吉、岱山、洞头、泰顺、文成。"
			+ "!安徽省：(79) 合肥市、长丰、肥西、舒城、桐城、庐江、肥东、六安、霍山、金寨、霍邱、巢湖、含山、和县、无为、寿县、蚌埠市、凤阳、定远、五河、怀远、蒙城、固镇、明光（嘉山）、淮南市、凤台、宿州、灵壁、泗县、淮北市、濉溪、肖县、砀山、阜阳市、颖上、阜南、临泉、界首、太和、利辛、亳州、涡阳、滁州市、来安、天长、全椒、芜湖市、芜湖县、繁昌、南陵、青阳、马鞍山市、当涂、铜陵市、铜陵县、石台、池州、宣州、郎溪、广德、宁国、泾县、旌德、黄山市、歙县、绩溪、休宁、黟县、祁门、黄山区、安庆市、怀宁、望江、潜山、太湖、宿松、岳西、枞阳、东至。"
			+ "!福建省：(68) 福州、闽侯、长乐、福清、平潭、连江、罗源、永泰、闽清、莆田、仙游、宁德、古田、屏南、福安、霞浦、福鼎、柘荣、周宁、寿宁、南平、建瓯、顺昌、浦城、松溪、政和、邵武、光泽、建阳、武夷山、厦门、同安、漳州、龙海、漳浦、云霄、东山、诏安、南靖、平和、华安、长泰、泉州、惠安、晋江、南安、安溪、德化、永春、石狮、龙岩、永定、上杭、武平、连城、长汀、漳平、三明、尤溪、明溪、清流、宁化、沙县、永安、大田、将乐、泰宁、建宁。"
			+ "!宁夏自治区：(17) 银川市、永宁县、贺兰县、吴忠市、灵武市、青铜峡市、中卫市、石嘴山市、惠农区、固原市、海原、平罗、陶乐、同心、西吉、盐池，中宁。"
			+ "!江西省：(92) 南昌市、景德镇市、萍乡市、新余市、九江市、鹰潭市、新建、南昌县、永修、德安、安义、靖安、奉新、高安、丰城、樟树、新干、峡江、进贤、余干、余江、贵溪、万年、东乡、赣州、赣县、上犹、崇义、南康、大余、信丰、龙南、全南、定南、安远、寻乌、于都、兴国、瑞金、会昌、石城、宁都、九江县、瑞昌、武宁、修水、湖口、都昌、彭泽、星子、庐山、波阳、婺源、乐平、浮梁、上饶、上饶县、德兴、横峰、弋阳、铅山、广丰、玉山、宜春、万载、铜鼓、宜丰、上高、分宜、莲花、吉安、吉安县、安福、永新、宁冈、井岗山、泰和、万安、遂川、永丰、吉水、抚州、临川、崇仁、乐安、宜黄、南丰、黎川、南城、金溪、广昌、资溪。"
			+ "!山东省：(108) 济南、章丘、长清、平阴、济阳、商河、惠民、阳信、无棣、邹平、博兴、滨州、沾化、德州、齐河、禹城、临邑、平原、夏津、武城、宁津、陵县、乐陵、庆云、烟台、莱州、牟平、威海、荣城、文登、乳山、海阳、莱阳、栖霞、招远、蓬莱、青岛、即墨、胶州、胶南、莱西、平度、五莲、莒县、日照、淄博、沂源、高青、桓台、东营、广饶、利津、垦利、聊城、茌平、东阿、阳谷、莘县、冠县、临清、高唐、潍坊、昌邑、高密、安丘、诸城、昌乐、青州、临朐、寿光、泰安、莱芜、新泰、宁阳、东平、肥城、济宁、兖州、金乡、鱼台、嘉祥、汶上、梁山、曲阜、泗水、邹城、枣庄、滕州、微山、菏泽、定陶、成武、单县、曹县、东明、鄄城、郓城、巨野、临沂、平邑、费县、郯城、蒙阴、沂南、沂水、莒南、临沭、苍山。"
			+ "!河南省：(131个) 郑州、上街区、荥阳、新郑、巩义、中牟、新密、登封市、平顶山市、郏县、叶县、鲁山、宝丰、信阳市、信阳县、罗山、息县、淮滨、潢川、固始、商城、光山、新县、洛阳市、孟津、汝阳、伊川、嵩县、栾川、宜阳、洛宁、新安、偃师、三门峡市、陕县、卢氏、义马、渑池、灵宝、汝州、济源、南阳市、邓州、镇平、内乡、淅川、西峡、南召、桐柏、方城、社旗、唐河、新野、南阳县、新乡市、卫辉、延津、封丘、长垣、原阳、辉县、新乡县、获嘉、焦作市、修武、博爱、沁阳、孟县、温县、武陟、安阳市、安阳县、汤阴、浚县、内黄、滑县、林州、淇县、濮阳市、濮阳县、清丰、南乐、范县、台前、鹤壁市、许昌市、许昌县、鄢陵、长葛、禹州、襄城、驻马店市、遂平、确山、汝南、平舆、新蔡、正阳、泌阳、上蔡、西平、开封市、开封县、杞县、兰考、通许、尉氏、漯河市、郾城、舞阳、舞钢、临颖、周口市、商水、项城、西华、淮阳、扶沟、太康、商丘市、商丘县、柘城、虞城、夏邑、永城、宁陵、民权、睢县、郸城、鹿邑、沈丘。"
			+ "!湖北省：(68) 武汉市、黄石市、襄樊市、十堰市、荆州市、宜昌市、荆门市、鄂州市、孝感市、黄冈市、蔡甸区、江夏区、黄陂、新洲、汉川、天门、京山、钟祥、仙桃、潜江、洪湖、监利、襄阳、枣阳、随州、宜城、南漳、谷城、老河口、宜昌县、枝江、宜都（枝城）、长阳、当阳、远安、松滋、公安、石首、大冶、阳新、蕲春、武穴、黄梅、咸宁地区、咸宁、嘉鱼、赤壁（蒲圻）、通城、崇阳、通山、房县、陨县、丹江口、恩施、建始、宣恩、浠水、麻城、红安、罗田、英山、团风、应城、云梦、安陆、广水、大悟、孝昌。"
			+ "!湖南省：(101)长沙市、株洲市、湘潭市、衡阳市、邵阳市、岳阳市、常德市、郴州市、益阳市、永州市、怀化市、长沙县、望城、浏阳、宁乡、湘潭县、韶山、湘乡、株洲县、醴陵、攸县、茶陵、炎陵、益阳县、沅江、南县、桃江、安化、张家界、岳阳县、华容、临湘、汨罗、平江、湘阴、常德县（鼎城区）、临澧、石门、津市、澧县、安乡、桃源、汉寿、吉首、泸溪、凤凰、古丈、花垣、保靖、永顺、龙山、娄底、涟源、双峰、冷水江、新化、洪江、会同、靖州、通道、芷江、新晃、溆浦、麻阳、辰溪、沅陵、衡阳县、衡山、衡东、常宁、祁东、耒阳、南岳、邵阳县、隆回、洞口、武冈、城步、绥宁、新宁、邵东、新邵、永兴、资兴、桂东、安仁、汝城、宜章、临武、桂阳、祁阳、双牌、道县、江永、江华、宁远、新田、蓝山、东安、桑植、慈利。"
			+ "!西藏自治区：(14) 拉萨市、那曲地区那曲镇、林芝地区八一镇、日喀则市、山南地区泽当镇、乃东县、贡嗄县、扎囊县、达孜县、墨竹工卡县、曲水县、堆龙德庆县、当雄县、尼木县。"
			+ "!广东省：(101)广州、新丰、增城、花都、从化、番禺、清远、佛冈、清新、英德、阳山、连山、连南、连州、中山、汕头、潮阳、惠来、普宁、揭西、揭东、潮安、饶平、澄海、南澳、潮州、揭阳、深圳、湛江、遂溪、廉江、吴川、雷州、徐闻、韶关、曲江、乐昌、仁化、南雄、始兴、翁源、乳源、珠海、斗门、茂名、化州、高州、信宜、电白、肇庆、高要、四会、广宁、怀集、封开、德庆、郁南、罗定、云安、云浮、新兴、梅州、蕉岭、大埔、丰顺、五华、兴宁、平远、梅县、惠州、龙门、大亚湾、博罗、惠阳、惠东、海丰、陆丰、汕尾、陆河、河源、东源、连平、和平、龙川、紫金、江门、新会、台山、开平、恩平、阳江、阳春、阳东、阳西、鹤山、佛山、三水、南海、顺德、高明、东莞。"
			+ "!广西自治区：(61)南宁市、柳州市、桂林市、梧州市、北海市、防城港市、钦州市、贵港市、武鸣、邕宁、横县、宾阳、平果、田东、扶绥、崇左、龙州、宁明、凭祥、浦北、灵山、合浦、桂平、平南、柳江、柳城、融水、融安、三江、鹿寨、象州、武宣、来宾、宜州、合山、荔浦、蒙山、昭平、、临桂、灵川、兴安、资源、全州、龙胜、永福、阳朔、平乐、钟山、富川、贺州、苍梧、岑溪、藤县、玉林、北流、容县、博白、陆川、百色、田阳、河池。"
			+ "!海南省：(20)海口市、三亚市、琼山市、定安、文昌、琼海、万宁、屯昌、儋州、临高、澄迈、五指山市(通什)、保亭、陵水、乐东、东方、昌江、白沙、琼中、洋浦经济开发区。"
			+ "!四川省：(99)成都市、自贡市、攀枝花市、泸州市、德阳市、绵阳市、广元市、遂宁市、内江市、乐山市、宜宾市、南充市、龙泉驿区、双流、青白江区、金堂、新都、温江、崇州、大邑、新津、邛崃、蒲江、郫县、都江堰、彭州、眉山、丹棱、洪雅、青神、仁寿、彭山、蓬溪、射洪、青川、旺苍、剑阁、苍溪、达州、大竹、万源、西充、营山、蓬安、广安、岳池、武胜、邻水、华蓥、南溪、江安、长宁、兴文、珙县、宜宾县、高县、筠连、屏山、泸县、纳溪区、叙永、资中、资阳、简阳、乐至、隆昌、安岳、威远、荣县、富顺、西昌（凉山州）、米易、夹江、峨眉山、五通桥区、中江、绵竹、广汉、什邡、三台、盐亭、江油、梓潼、安县、北川、雅安、名山、荥经、巴中、大英、达县、东兴、高坪区、金河口、嘉陵区、楗为、康定、顺庆区，沙湾。"
			+ "!贵州省：(82)贵阳市、遵义、安顺、都匀、凯里、毕节、铜仁、六盘水、兴义。罗甸、修文、开阳、瓮安、福泉、惠水、长顺、息烽、龙里、贵定、清镇、黔西、大方、三都、独山、平塘、荔波、威宁、赫章、纳雍、六枝特区、盘县、松桃、万山、江口、石阡、玉屏、印江、思南、德江、沿河、黄平、施秉、台江、剑河、三穗、天柱、锦屏、雷山、榕江、黎平、从江、丹寨、麻江、镇远、岑巩、平坝、镇宁、关岭、晴隆、普安、紫云、织金、普定、贞丰、兴仁、册亨、望谟、安龙、遵义县、桐梓、绥阳、正安、道真、金沙、湄潭、风冈、务川、余庆、仁怀、习水、水城、赤水。"
			+ "!陕西省：(85)西安、阎良、长安、高陵、户县、周至、蓝田、临潼、柞水、镇安、宁陕、富平、耀县、宜君、黄陵、洛川、富县、铜川、宝鸡、千阳、陇县、宝鸡县、凤翔、麟游、太白、凤县、扶风、眉县、岐山、安康、汉阴、石泉、紫阳、岚皋、平利、镇坪、旬阳、白河、咸阳、杨凌区、武功、兴平、礼泉、乾县、泾阳、三原、渭南、华县、华阴、潼关、大荔、澄城、合阳、韩城、蒲城、白水、黄龙、延安、甘泉、宜川、延川、志丹、吴旗、榆林、神木、府谷、绥德、米脂、清涧、汉中、南郑、城固、洋县、佛坪、西乡、镇巴、留坝、勉县、略阳、宁强、商州、洛南、丹凤、商南、山阳。"
			+ "!云南省：(136) 昆明市、玉溪、大理、曲靖、个旧、丽江、景洪、潞西、昭通、文山、安宁、富民、呈贡、晋宁、易门、禄劝、武定、嵩明、宜良、路南、澄江、江川、通海、华宁、峨山、元江、新平、东川、墨江、寻甸、畹町、瑞丽、陇川、马龙、宣威、富源、陆良、师宗、罗平、蒙自、弥勒、建水、开远、砚山、邱北、西畴、麻栗坡、马关、思茅、普洱、勐海、勐腊、洱源、剑川、鹤庆、宾川、巍山、漾鼻、永平、云龙、弥渡、南涧、楚雄、双柏、南华、姚安、大姚、牟定、禄丰、元谋、永仁、祥云、保山、迪庆、临沧、西双版纳州、昌宁县、沧源县、德钦县，大关县、德宏州、福贡县、富宁县、凤庆县、古城区县、耿马县、广南县、贡山县、红河县、红河州、河口县、华坪县、会泽县、江城县、景东县，景谷县、金平县、澜沧县、绿春县、龙陵县、兰坪县、鲁甸县、梁河县、六库县、泸水县、泸西县、孟连县、怒江州、宁蒗县、屏边县、巧家县、绥江县、施甸县、水富县、双江县、石林、石屏县、腾冲县、维西县、威信县、香格里拉县、西盟县、永胜县、盐津县、盈江县、彝良县、玉龙县、永善县、云县、永德县、元阳县、镇源县、中甸、镇康县、镇雄县、沾益县。"
			+ "!青海省：(12) 西宁市、大通、互助、湟中、湟源、格尔木、海东、乐都、民和、海西、矿区、乌兰。"
			+ "!甘肃省：(75) 兰州市、榆中、皋兰、永登、景泰、临洮、靖远、会宁、白银、临夏州、和政、广河、东乡、康乐、永靖、积石山、临夏县、甘南、夏河、碌曲、玛曲、迭部、临潭、卓尼、渭源、漳县、岷县、宕昌、酒泉、嘉峪关、玉门、金塔、武威、古浪、天祝、民勤、金昌、永昌、张掖、山丹、临泽、高台、肃南、民乐、柳园、安西、敦煌、天水、甘谷、武山、清水、张家川、秦安、西和、礼县、徽县、两当、成县、武都、陇西、定西、通渭、静宁、平凉、华亭、崇信、泾川、灵台、镇原、庄浪、西峰、庆阳、宁县、正宁、合水。"
			+ "!新疆：(16) 乌鲁木齐市、昌吉、石河子、奎屯、博乐、克拉玛依、塔城、伊宁、阿勒泰、吐鲁番、哈密、库尔勒、阿克苏、阿图什、和田、喀什。";

	private Map<String, Set<String>> codMappings;

	public No5COD() {
		codMappings = new TreeMap<String, Set<String>>();
		String[] cods = COD_STR.split("!");
		for (String cod : cods) {
			if (cod.trim().isEmpty())
				continue;
			String[] locations = cod.split("[：、。]");
			Set<String> mapping = new TreeSet<String>();
			for (int i = 1; i < locations.length; ++i) {
				locations[i] = getCityOrDistrictName(locations[i]);
				if (!locations[i].isEmpty())
					mapping.add(locations[i]);
			}
			codMappings.put(getProvinceName(locations[0]), mapping);
		}
	}

	@Override
	public int supportCOD(UserAddress address) {
		String province = getProvinceName(address.getProvince());
		if (!codMappings.containsKey(province))
			return NONSUPPORT;
		Set<String> cities = codMappings.get(province);
		if (isRegions(address.getCity())) {
			if (cities.isEmpty())
				return SUPPORT;
			String district = getCityOrDistrictName(address.getDistrict());
			if (cities.contains(district))
				return SUPPORT;
		} else {
			String city = getCityOrDistrictName(address.getCity());
			if (cities.contains(city))
				return SUPPORT;
		}
		return NONSUPPORT;
	}

	public static void main(String[] args) {
		No5COD no5cod = new No5COD();
		for (Entry<String, Set<String>> entry : no5cod.codMappings.entrySet())
			System.out.println(entry.getValue().size() + " " + entry);
		UserAddress address = new UserAddress();
		address.setProvince("北京");
		address.setCity("北京市");
		address.setDistrict("东城区");
		System.out.println(no5cod.supportCOD(address));
	}
}
